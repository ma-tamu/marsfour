package jp.co.project.planets.marsfour.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import jp.co.project.planets.marsfour.db.dao.PermissionDao;
import jp.co.project.planets.marsfour.db.entity.Permission;

/**
 * permission repository
 */
@Repository
public class PermissionRepository {

    private final PermissionDao permissionDao;

    public PermissionRepository(final PermissionDao permissionDao) {
        this.permissionDao = permissionDao;
    }

    /**
     * find by user id
     * 
     * @param userId
     *            user id
     * @return user granted permissions
     */
    public List<Permission> findByUserId(final String userId) {
        return permissionDao.selectByUserId(userId);
    }
}
