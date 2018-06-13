package com.bizoe.ldapcheck.domain;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by wangxinxin on 2018/6/13.
 */
@Component
public class AdUser {
    @ApiModelProperty("组织部门，例如ou=rws")
    @Value("${userinfo.ou}")
    private String ou;
    @ApiModelProperty("base信息，例如dc=sensetime,dc=com")
    @Value("${userinfo.base}")
    private String base;
    @ApiModelProperty("AD域服务器IP")
    @Value("${userinfo.host}")
    private String host;
    @ApiModelProperty("AD域服务器PORT")
    @Value("${userinfo.port}")
    private String port;
    @ApiModelProperty("AD域用户名")
    private String name;
    @ApiModelProperty("AD域用户密码")
    private String password;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getOu() {
        return ou;
    }

    public void setOu(String ou) {
        this.ou = ou;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AdUser{" +
                "ou='" + ou + '\'' +
                ", base='" + base + '\'' +
                ", host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
