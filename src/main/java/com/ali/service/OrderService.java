package com.ali.service;

import com.ali.entity.Order;

import java.util.List;

public interface OrderService {
    //展示订单
    List<Order> getorderShow(int uid);
}
