package com.ali.entity;

import java.io.Serializable;

/**
 * (SysCity)实体类
 *
 * @author makejava
 * @since 2020-10-28 11:24:15
 */
public class SysCity implements Serializable {
    private static final long serialVersionUID = 100709206117465550L;

    private Integer cityid;

    private String name;

    private Integer pid;


    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

}