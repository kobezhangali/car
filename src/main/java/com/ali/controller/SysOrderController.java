package com.ali.controller;

import com.ali.entity.SysOrder;
import com.ali.service.SysOrderService;
import com.sun.deploy.net.HttpResponse;
import lombok.val;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

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
    @GetMapping("delOrder")
    public void delOrder(int oid, HttpServletResponse response,int uid){
        boolean re=this.sysOrderService.deleteById(oid);

        try {
            response.sendRedirect("http://localhost:8081/MySSM_war/page/mymain/mymain.html?uid="+uid);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @PostMapping("add")
    public HashMap<String,Object> add(SysOrder sysOrder) {

        sysOrder.setStatus("已预订");
        SysOrder order = this.sysOrderService.insert(sysOrder);
        HashMap<String, Object> map = new HashMap<>();
        if (order != null) {
            map.put("code", 0);
            map.put("count", 1000);
            map.put("msg", "");
            map.put("data", true);

        }
        return map;
    }
}