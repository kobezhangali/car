package com.ali.entity;

import java.io.Serializable;

/**
 * (SysCar)实体类
 *
 * @author makejava
 * @since 2020-10-28 11:24:14
 */
public class SysCar implements Serializable {
    private static final long serialVersionUID = 857887325377765325L;

    private Integer carid;

    private String name;

    private String type;

    private Integer sitnum;

    private Integer cityid;

    private Object price;

    private Integer number;

    private String picture;


    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSitnum() {
        return sitnum;
    }

    public void setSitnum(Integer sitnum) {
        this.sitnum = sitnum;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

}