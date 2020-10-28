package com.ali.entity;

import java.io.Serializable;

/**
 * (SysOrder)实体类
 *
 * @author makejava
 * @since 2020-10-28 11:24:16
 */
public class SysOrder implements Serializable {
    private static final long serialVersionUID = -12308597458630779L;

    private Integer oid;

    private Integer carid;

    private Integer uid;

    private Integer getid;

    private Integer backid;

    private Object oprice;

    private String status;


    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getGetid() {
        return getid;
    }

    public void setGetid(Integer getid) {
        this.getid = getid;
    }

    public Integer getBackid() {
        return backid;
    }

    public void setBackid(Integer backid) {
        this.backid = backid;
    }

    public Object getOprice() {
        return oprice;
    }

    public void setOprice(Object oprice) {
        this.oprice = oprice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}