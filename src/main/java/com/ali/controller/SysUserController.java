package com.ali.controller;

import com.ali.entity.SysUser;
import com.ali.service.SysUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (SysUser)表控制层
 *
 * @author makejava
 * @since 2020-10-28 11:24:17
 */
@RestController
@RequestMapping("sysUser")
public class SysUserController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{id}")
    public SysUser selectOne(@PathVariable("id") Integer id) {
        return this.sysUserService.queryById(id);
    }

}