package com.ali.controller;

import com.ali.entity.SysOrder;
import com.ali.service.SysOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (SysOrder)表控制层
 *
 * @author makejava
 * @since 2020-10-28 11:24:16
 */
@RestController
@RequestMapping("sysOrder")
public class SysOrderController {
    /**
     * 服务对象
     */
    @Resource
    private SysOrderService sysOrderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysOrder selectOne(Integer id) {
        return this.sysOrderService.queryById(id);
    }

}