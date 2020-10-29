package com.ali.controller;

import com.ali.entity.SysCar;
import com.ali.service.SysCarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
     * @param cid 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysCar selectOne(Integer cid) {

//        SysCar sysCar = sysCarService.queryById(cid);
//
//        Map<String,Object> map = new HashMap<String,Object>();
//
//        map.put("code", 0);
//        map.put("count", 1000);
//        map.put("msg", "");
//        map.put("data", sysCar);

        return this.sysCarService.queryById(cid);
    }

    @GetMapping("selectAll")
    public List<SysCar> selectAll(SysCar sysCar){
        return this.sysCarService.queryAll(sysCar);
    }

    @GetMapping("ascCar")
    public List<SysCar> ascCar(){
        return this.sysCarService.ascCar();
    }

    @GetMapping("descCar")
    public List<SysCar> descCar(){
        return this.sysCarService.descCar();
    }
}