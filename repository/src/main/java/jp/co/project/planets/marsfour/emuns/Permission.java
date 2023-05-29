package jp.co.project.planets.marsfour.emuns;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

/**
 * permission enum
 */
public enum Permission {
    VIEW_ALL_ROLE(""),
    EDIT_ROLE("");

    private final String id;

    Permission(final String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public static Permission of(final String id) {
        return Arrays.stream(Permission.values()).filter(it -> StringUtils.equals(it.getId(), id)).findFirst()
                .orElse(null);
    }

}
