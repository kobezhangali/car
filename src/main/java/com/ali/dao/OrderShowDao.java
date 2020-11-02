package com.ali.dao;

import com.ali.entity.Order;

import java.util.List;

public interface OrderShowDao {
    List<Order> getorderShow(int uid);
}
