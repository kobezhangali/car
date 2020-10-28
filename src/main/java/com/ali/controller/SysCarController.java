package com.ali.controller;

import com.ali.entity.SysCar;
import com.ali.service.SysCarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (SysCar)表控制层
 *
 * @author makejava
 * @since 2020-10-28 11:24:14
 */
@RestController
@RequestMapping("sysCar")
public class SysCarController {
    /**
     * 服务对象
     */
    @Resource
    private SysCarService sysCarService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysCar selectOne(Integer id) {
        return this.sysCarService.queryById(id);
    }

}