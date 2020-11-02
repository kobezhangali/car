package com.ali.controller;

import com.ali.entity.Order;
import com.ali.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController {
    @Resource
    private OrderService orderService;
    @GetMapping("getOrder")
    public HashMap<String, Object> getOrder(int uid){

        HashMap<String,Object> map=new HashMap<String,Object>();
        List<Order> list=orderService.getorderShow(uid);
        map.put("code", 0);
        map.put("count", 1000);
        map.put("msg", "");
        map.put("info", list);
        return map;
    }
}
