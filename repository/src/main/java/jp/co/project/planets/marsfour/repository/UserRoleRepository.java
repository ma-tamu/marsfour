package jp.co.project.planets.marsfour.repository;

import org.springframework.stereotype.Repository;

import jp.co.project.planets.marsfour.db.dao.UserRoleDao;

/**
 * user role repository
 */
@Repository
public class UserRoleRepository {

    private final UserRoleDao roleDao;

    public UserRoleRepository(final UserRoleDao roleDao) {
        this.roleDao = roleDao;
    }
}
