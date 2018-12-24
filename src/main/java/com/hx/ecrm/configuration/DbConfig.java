package com.hx.ecrm.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ratel
 * @create 2018/12/24
 */
@ConfigurationProperties(prefix = DbConfig.PREFIX)
public class DbConfig {

    public static final String PREFIX = "db";

    private String userName;

    private String url;

    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
