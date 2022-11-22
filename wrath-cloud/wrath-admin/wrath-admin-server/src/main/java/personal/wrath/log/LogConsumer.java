

package personal.wrath.log;

import personal.wrath.commons.log.BaseLog;
import personal.wrath.commons.log.enums.LogTypeEnum;
import personal.wrath.commons.tools.exception.ExceptionUtils;
import personal.wrath.commons.tools.redis.RedisKeys;
import personal.wrath.commons.tools.redis.RedisUtils;
import personal.wrath.commons.tools.utils.ConvertUtils;
import personal.wrath.entity.SysLogErrorEntity;
import personal.wrath.entity.SysLogLoginEntity;
import personal.wrath.entity.SysLogOperationEntity;
import personal.wrath.service.SysLogErrorService;
import personal.wrath.service.SysLogLoginService;
import personal.wrath.service.SysLogOperationService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.concurrent.BasicThreadFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 从Redis队列中获取Log，保存到DB
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0
 */
@Slf4j
@Component
public class LogConsumer implements CommandLineRunner {
    @Autowired
    private RedisUtils redisUtils;
    @Autowired
    private SysLogErrorService sysLogErrorService;
    @Autowired
    private SysLogLoginService sysLogLoginService;
    @Autowired
    private SysLogOperationService sysLogOperationService;
    private ScheduledExecutorService scheduledService = new ScheduledThreadPoolExecutor(1,
            new BasicThreadFactory.Builder().namingPattern("log-consumer-schedule-pool-%d").daemon(true).build());

    @Override
    public void run(String... args) {
        //上次任务结束后，等待10秒钟，再执行下次任务
        scheduledService.scheduleWithFixedDelay(() -> {
            try {
                receiveQueue();
            }catch (Exception e){
                log.error("LogConsumer Error："+ ExceptionUtils.getErrorStackTrace(e));
            }
        }, 1, 10, TimeUnit.SECONDS);
    }

    private void receiveQueue() {
        String key = RedisKeys.getSysLogKey();
        //每次插入100条
        int count = 100;
        for(int i = 0; i < count; i++){
            BaseLog log = (BaseLog) redisUtils.rightPop(key);
            if(log == null){
                return;
            }

            //登录日志
            if(log.getType() == LogTypeEnum.LOGIN.value()){
                SysLogLoginEntity entity = ConvertUtils.sourceToTarget(log, SysLogLoginEntity.class);
                sysLogLoginService.save(entity);
            }

            //操作日志
            if(log.getType() == LogTypeEnum.OPERATION.value()){
                SysLogOperationEntity entity = ConvertUtils.sourceToTarget(log, SysLogOperationEntity.class);
                sysLogOperationService.save(entity);
            }

            //异常日志
            if(log.getType() == LogTypeEnum.ERROR.value()){
                SysLogErrorEntity entity = ConvertUtils.sourceToTarget(log, SysLogErrorEntity.class);
                sysLogErrorService.save(entity);
            }
        }
    }

}