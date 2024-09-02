package com.example.config;

import io.micronaut.context.annotation.EachProperty;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;

@EachProperty(value = Registration.PREFIX, list = true)
public class Registration {
    public static final String PREFIX = "registration";

    @NonNull
    private String name;

    @NonNull
    private String adminURL;

    @Nullable
    private String taskerURL = null;

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public String getAdminURL() {
        return adminURL;
    }

    public void setAdminURL(@NonNull String adminURL) {
        this.adminURL = adminURL;
    }

    @Nullable
    public String getTaskerURL() {
        return taskerURL;
    }

    public void setTaskerURL(@Nullable String taskerURL) {
        this.taskerURL = taskerURL;
    }
}
