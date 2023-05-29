package jp.co.project.planets.marsfour.common.logic;

import java.util.List;

import org.springframework.stereotype.Component;

import jp.co.project.planets.marsfour.emuns.Permission;
import jp.co.project.planets.marsfour.repository.PermissionRepository;

/**
 * permission logic
 */
@Component
public class PermissionLogic {

    private final PermissionRepository permissionRepository;

    public PermissionLogic(final PermissionRepository permissionRepository) {
        this.permissionRepository = permissionRepository;
    }

    /**
     * find by user id
     *
     * @param userId
     *            user id
     * @return user granted permissions
     */
    public List<Permission> findGrantedPermission(final String userId) {
        final var permissionList = permissionRepository.findByUserId(userId);
        return permissionList.stream().map(permission -> Permission.of(permission.getId())).toList();
    }
}
