package jp.co.project.planets.marsfour.webapp.security.service;

import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserRequest;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Service;

import jp.co.project.planets.marsfour.common.logic.PermissionLogic;
import jp.co.project.planets.marsfour.webapp.security.model.dto.UserInfoDto;

@Service
public class OidcUserInfoService extends OidcUserService {

    private final PermissionLogic permissionLogic;

    public OidcUserInfoService(final PermissionLogic permissionLogic) {
        this.permissionLogic = permissionLogic;
    }

    @Override
    public OidcUser loadUser(final OidcUserRequest userRequest) throws OAuth2AuthenticationException {
        final var oidcUser = super.loadUser(userRequest);
        final var permissionList = permissionLogic.findGrantedPermission(oidcUser.getSubject());
        // TODO userInfoのsubjectには、ログインIDが格納されているのでユーザーIDを取得する必要がある。
        return new UserInfoDto(oidcUser.getSubject(), oidcUser.getSubject(), permissionList, oidcUser.getUserInfo(),
                oidcUser.getAuthorities(),
                oidcUser.getIdToken());
    }
}
