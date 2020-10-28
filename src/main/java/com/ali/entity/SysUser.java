package com.ali.entity;

import java.io.Serializable;

/**
 * (SysUser)实体类
 *
 * @author makejava
 * @since 2020-10-28 11:24:16
 */
public class SysUser implements Serializable {
    private static final long serialVersionUID = 496481515612995212L;

    private Integer uid;

    private String tel;

    private String password;

    private String email;

    private String invitation;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInvitation() {
        return invitation;
    }

    public void setInvitation(String invitation) {
        this.invitation = invitation;
    }

}