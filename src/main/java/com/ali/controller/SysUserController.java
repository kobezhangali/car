package com.ali.controller;

import com.ali.dao.SysUserDao;
import com.ali.entity.SysUser;
import com.ali.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * (SysUser)表控制层
 *
 * @author makejava
 * @since 2020-10-28 11:24:17
 */
@RestController
@RequestMapping("sysUser")
@CrossOrigin
@SessionAttributes("Save")
class SysUserController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;


    @GetMapping("selectOne")
    public SysUser selectOne(Integer uid) {
        System.out.println("uid");

        return this.sysUserService.queryById(uid);
    }
    /**
     * 通过tel查询user
     */
    @GetMapping("selectByTel")
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
        HashMap<String,Object> map=new HashMap<String,Object>();
        SysUser users=this.sysUserService.getUserByTel(user.getTel());
        if(users==null){
            this.sysUserService.insert(user);
            map.put("code", 0);
            map.put("count", 1000);
            map.put("msg", "");
            map.put("data", user);
            return map;
        }else{
            return null;
        }

    }
    /*@PostMapping("login")
    public HashMap<String,Object> login(String tel,String password){

        SysUser users=this.sysUserService.getUserByTel(tel);
        *//*System.out.println(tel);
        System.out.println(password);*//*
        HashMap<String,Object> map=new HashMap<>();

        if(users!=null) {
            if ((users.getPassword()).equalsIgnoreCase(password)) {
                map.put("code", 0);
                map.put("count", 1000);
                map.put("msg", "");
                map.put("data", users);
                *//*return map;*//*
            }
        }return map;
    }*/
     @PostMapping("login")

     public SysUser login (SysUser user){
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
     }
    @PostMapping("update")
    public SysUser upDate(SysUser user){
        return this.sysUserService.update(user);
    }
}