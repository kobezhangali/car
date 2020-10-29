package com.ali.controller;

import com.ali.entity.SysUser;
import com.ali.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

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
    /**
     * 通过tel查询user
     */
    @GetMapping("selectByTel/{tel}")
    public SysUser selectByTel(String tel){
        return this.sysUserService.getUserByTel(tel);
    }


    /*@PostMapping("regist")
    public int addrUser(SysUser user){
        List<SysUser> list =sysUserService.getAllUser();
        for (SysUser sysUser : list) {
            if((sysUser.getTel()).equalsIgnoreCase(user.getTel())){
                return 0;
            }
        }
         this.sysUserService.insert(user);
        return 1;
    }*/
    @PostMapping("regist")
    public HashMap<String,Object> regist(SysUser user){
        List<SysUser> list =sysUserService.getAllUser();
        HashMap<String,Object> map=new HashMap<>();
        for (SysUser sysUser : list) {
            if(!((sysUser.getTel()).equalsIgnoreCase(user.getTel()))){
                map.put("code", 0);
                map.put("count", 1000);
                map.put("msg", "");
                map.put("data", user);

            }
        }
        this.sysUserService.insert(user);
        return map;
    }
    @PostMapping("login")

    public HashMap<String,Object> login(String tel,String password){

        SysUser users=this.sysUserService.getUserByTel(tel);
        /*System.out.println(tel);
        System.out.println(password);*/
        HashMap<String,Object> map=new HashMap<>();

        if(users!=null) {
            if ((users.getPassword()).equalsIgnoreCase(password)) {
                map.put("code", 0);
                map.put("count", 1000);
                map.put("msg", "");
                map.put("data", users);
                /*return map;*/
            }
        }return map;
    }
    /* @PostMapping("login")
     public SysUser login(SysUser user){
     SysUser users=this.sysUserService.getUserByTel(user.getTel());
         if(users!=null){
             if((users.getPassword()).equalsIgnoreCase(user.getPassword())){
                 return users;
             }else {
                 return users;
             }
         }else {
             return users;
         }
     }*/
    @PostMapping("update")
    public SysUser upDate(SysUser user){
        return this.sysUserService.update(user);
    }
}