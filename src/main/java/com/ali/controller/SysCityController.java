package com.ali.controller;

import com.ali.entity.SysCity;
import com.ali.service.SysCityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysCity)表控制层
 *
 * @author makejava
 * @since 2020-10-28 11:24:16
 */
@RestController
@RequestMapping("sysCity")
@CrossOrigin
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

    @GetMapping("queryCart")
    public List<SysCity> queryCart() {
        return this.sysCityService.queryCart();
    }

    @GetMapping("queryCartByPid")
    public List<SysCity> queryCartByPid(int cityid) {
        System.out.println("111111111111111");
        System.out.println(cityid);
        return this.sysCityService.queryCartByPid(cityid);
    }

    @GetMapping("queryCartAddressByCityid")
    public List<SysCity> queryCartAddressByCityid(int cityid) {
        return this.sysCityService.queryCartAddressByCityid(cityid);
    }
}