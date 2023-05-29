package jp.co.project.planets.marsfour.db.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import jp.co.project.planets.marsfour.db.annotation.ConfigAutowireable;
import jp.co.project.planets.marsfour.db.dao.base.PermissionBaseDao;
import jp.co.project.planets.marsfour.db.entity.Permission;

/**
 * permission dao
 */
@Dao
@ConfigAutowireable
public interface PermissionDao extends PermissionBaseDao {

    /**
     * select by userId
     * 
     * @param userId
     *            user id
     * @return user granted permissions
     */
    @Select
    List<Permission> selectByUserId(String userId);
}
