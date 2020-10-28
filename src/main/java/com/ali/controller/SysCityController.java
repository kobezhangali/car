package com.ali.controller;

import com.ali.entity.SysCity;
import com.ali.service.SysCityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (SysCity)表控制层
 *
 * @author makejava
 * @since 2020-10-28 11:24:16
 */
@RestController
@RequestMapping("sysCity")
public class SysCityController {
    /**
     * 服务对象
     */
    @Resource
    private SysCityService sysCityService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysCity selectOne(Integer id) {
        return this.sysCityService.queryById(id);
    }

}