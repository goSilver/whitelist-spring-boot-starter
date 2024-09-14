package cn.gosilver.middleware.whitelist.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 白名单配置获取
 * ConfigurationProperties，用于创建指定前缀( prefix = "gosilver.whitelist" )的自定义配置信息，
 * 这样就在 yml 或者 properties 中读取到我们自己设定的配置信息。
 *
 * Author: chensh
 * Date: 2024/9/14 2:16 PM
 */
@ConfigurationProperties(prefix = "gosilver.whitelist")
public class WhiteListProperties {
    private String users;

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }
}
