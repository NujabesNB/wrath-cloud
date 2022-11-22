

package personal.wrath.service;

import personal.wrath.commons.mybatis.service.CrudService;
import personal.wrath.dto.AlipayNotifyLogDTO;
import personal.wrath.entity.AlipayNotifyLogEntity;

/**
 * 支付宝回调日志
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface AlipayNotifyLogService extends CrudService<AlipayNotifyLogEntity, AlipayNotifyLogDTO> {

}