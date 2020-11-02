package com.ali.entity;

import lombok.Data;

@Data
public class Order {
    private int oid;
    private Object oprice;
    private String name;
    private String getname;
    private String backname;
    private String status;
}
