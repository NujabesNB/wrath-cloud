

package personal.wrath.cloud;

import personal.wrath.commons.tools.utils.SpringContextUtils;
import personal.wrath.enums.OssTypeEnum;
import personal.wrath.remote.ParamsRemoteService;
import personal.wrath.utils.ModuleConstant;

/**
 * 文件上传Factory
 *
 * @author Mark sunlightcs@gmail.com
 */
public final class OssFactory {
    private static ParamsRemoteService paramsRemoteService;

    static {
        OssFactory.paramsRemoteService = SpringContextUtils.getBean(ParamsRemoteService.class);
    }

    public static AbstractCloudStorageService build(){
        //获取云存储配置信息
        CloudStorageConfig config = paramsRemoteService.getValueObject(ModuleConstant.CLOUD_STORAGE_CONFIG_KEY, CloudStorageConfig.class);

        if(config.getType() == OssTypeEnum.QINIU.value()){
            return new QiniuCloudStorageService(config);
        }else if(config.getType() == OssTypeEnum.ALIYUN.value()){
            return new AliyunCloudStorageService(config);
        }else if(config.getType() == OssTypeEnum.QCLOUD.value()){
            return new QcloudCloudStorageService(config);
        }else if(config.getType() == OssTypeEnum.FASTDFS.value()){
            return new FastDFSCloudStorageService(config);
        }else if(config.getType() == OssTypeEnum.LOCAL.value()){
            return new LocalCloudStorageService(config);
        }else if(config.getType() == OssTypeEnum.MINIO.value()){
            return new MinioCloudStorageService(config);
        }

        return null;
    }

}