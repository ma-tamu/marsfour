package jp.co.project.planets.marsfour.repository;

import org.springframework.stereotype.Repository;

import jp.co.project.planets.marsfour.db.dao.RolePermissionDao;

/**
 * role permission repository
 */
@Repository
public class RolePermissionRepository {

    private final RolePermissionDao permissionDao;

    public RolePermissionRepository(final RolePermissionDao permissionDao) {
        this.permissionDao = permissionDao;
    }
}
