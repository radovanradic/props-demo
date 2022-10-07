package com.example.config;

import io.micronaut.context.annotation.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties("my.config")
public class MyConfiguration {

    private String id;

    private List<MyCustomConfig> customConfigs;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<MyCustomConfig> getCustomConfigs() {
        return customConfigs;
    }

    public void setCustomConfigs(List<MyCustomConfig> customConfigs) {
        this.customConfigs = customConfigs;
    }
}
