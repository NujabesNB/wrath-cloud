

package personal.wrath.dao;

import personal.wrath.commons.mybatis.dao.BaseDao;
import personal.wrath.entity.SysRoleUserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 角色用户关系
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0
 */
@Mapper
public interface SysRoleUserDao extends BaseDao<SysRoleUserEntity> {

    /**
     * 根据角色ids，删除角色用户关系
     * @param roleIds 角色ids
     */
    void deleteByRoleIds(Long[] roleIds);

    /**
     * 根据用户id，删除角色用户关系
     * @param userId 用户id
     */
    void deleteByUserId(Long userId);

    /**
     * 角色ID列表
     * @param userId  用户ID
     *
     * @return
     */
    List<Long> getRoleIdList(Long userId);
}