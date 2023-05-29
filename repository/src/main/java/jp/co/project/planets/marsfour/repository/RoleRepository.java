package jp.co.project.planets.marsfour.repository;

import org.springframework.stereotype.Repository;

import jp.co.project.planets.marsfour.db.dao.RoleDao;

/**
 * role repository
 */
@Repository
public class RoleRepository {

    private final RoleDao roleDao;

    public RoleRepository(final RoleDao roleDao) {
        this.roleDao = roleDao;
    }
}
