package com.xiongxl.ibatis.entity;

import java.io.Serializable;

/**
 * 菜单实体类
 * @author xiongxl
 * @version $Id: Menu.java, v 0.1 2019-04-19 上午9:13 xiongxl Exp $$
 */
public class Menu implements Serializable{
    private Integer authId;
    private String authName;
    private Integer menuClassId;
    private String authType;
    private String authUrl;
    private String authMark;
    private String desp;

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public Integer getMenuClassId() {
        return menuClassId;
    }

    public void setMenuClassId(Integer menuClassId) {
        this.menuClassId = menuClassId;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public String getAuthUrl() {
        return authUrl;
    }

    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
    }

    public String getAuthMark() {
        return authMark;
    }

    public void setAuthMark(String authMark) {
        this.authMark = authMark;
    }

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "authId=" + authId +
                ", authName='" + authName + '\'' +
                ", menuClassId=" + menuClassId +
                ", authType='" + authType + '\'' +
                ", authUrl='" + authUrl + '\'' +
                ", authMark='" + authMark + '\'' +
                ", desp='" + desp + '\'' +
                '}';
    }
}

