package jp.co.project.planets.marsfour.webapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import jp.co.project.planets.marsfour.webapp.security.handler.OidcSuccessHandler;
import jp.co.project.planets.marsfour.webapp.security.service.OidcUserInfoService;

/**
 * security config
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final OidcUserInfoService oidcUserInfoService;

    public SecurityConfig(final OidcUserInfoService oidcUserInfoService) {
        this.oidcUserInfoService = oidcUserInfoService;
    }

    /**
     * build security filter chain
     *
     * @param http
     *            http security
     * @return SecurityFilterChain
     * @throws Exception
     *             security filter failed build
     */
    @Bean
    public SecurityFilterChain securityFilterChain(final HttpSecurity http) throws Exception {
        http.httpBasic(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(
                        auth -> auth
                                .requestMatchers("/login/oauth2/code/earthly", "/error", "/health", "/quickTEST",
                                        "/fullTEST", "/awesomeTEST")
                                .permitAll().anyRequest().authenticated())
                .oauth2Login(
                        oauth2 -> oauth2.loginPage("/oauth2/authorization/earthly")
                                .userInfoEndpoint(userInfo -> userInfo.oidcUserService(oidcUserInfoService))
                                .successHandler(new OidcSuccessHandler())
                                .failureHandler(new SimpleUrlAuthenticationFailureHandler()));
        return http.build();
    }
}
