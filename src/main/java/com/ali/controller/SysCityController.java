package com.ali.controller;

import com.ali.entity.SysCity;
import com.ali.service.SysCityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
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
    @GetMapping("getCityByPid")
    public HashMap<String,Object> getCityByPid(int pid){
        List<SysCity> city=this.sysCityService.queryByPid(pid);
        HashMap<String,Object> map=new HashMap<String, Object>();
        map.put("code", 0);
        map.put("count", 1000);
        map.put("msg", "");
        map.put("info",city);
        return map;
    }


    @GetMapping("selectOne")
    public HashMap<String,Object> selectOne(Integer getid,Integer backid) {
        HashMap<String,Object> map = new HashMap<String, Object>();

        List<SysCity> list = new ArrayList<SysCity>();


        list.add(this.sysCityService.queryById(getid));
        list.add(this.sysCityService.queryById(backid));

        map.put("code", 0);
        map.put("count", 1000);
        map.put("msg", "");
        map.put("data", list);

        return map;
    }

    @PostMapping("selectAll")
    public List<SysCity> selectAll(SysCity sysCity){
        return this.sysCityService.queryAll(sysCity);
    }
}