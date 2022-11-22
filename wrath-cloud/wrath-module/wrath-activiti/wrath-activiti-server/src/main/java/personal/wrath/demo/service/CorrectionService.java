package personal.wrath.demo.service;

import personal.wrath.commons.mybatis.service.CrudService;
import personal.wrath.demo.dto.CorrectionDTO;
import personal.wrath.demo.entity.CorrectionEntity;

/**
 * 转正申请
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface CorrectionService extends CrudService<CorrectionEntity, CorrectionDTO> {

    void updateInstanceId(String instanceId, Long id);
}