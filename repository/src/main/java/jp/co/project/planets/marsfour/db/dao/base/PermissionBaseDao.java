package jp.co.project.planets.marsfour.db.dao.base;

import jp.co.project.planets.marsfour.config.DomaConfig;
import jp.co.project.planets.marsfour.db.entity.Permission;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import jp.co.project.planets.marsfour.db.annotation.ConfigAutowireable;

/**
 */
@Dao(config = DomaConfig.class)
@ConfigAutowireable
public interface PermissionBaseDao {

    /**
     * @param id
     * @return the Permission entity
     */
    @Select
    Permission selectById(String id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Permission entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Permission entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Permission entity);
}
