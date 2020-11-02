package com.ali.service.impl;

import com.ali.dao.OrderShowDao;
import com.ali.entity.Order;
import com.ali.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderShowDao orderShowDao;
    @Override
    public List<Order> getorderShow(int uid) {
        return orderShowDao.getorderShow(uid);
    }
}
