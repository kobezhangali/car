package com.ali.service;

import com.ali.entity.SysOrder;

import java.util.List;

/**
 * (SysOrder)表服务接口
 *
 * @author makejava
 * @since 2020-10-28 11:24:16
 */
public interface SysOrderService {

    /**
     * 通过ID查询单条数据
     *
     * @param oid 主键
     * @return 实例对象
     */
    SysOrder queryById(Integer oid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysOrder> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysOrder 实例对象
     * @return 实例对象
     */
    SysOrder insert(SysOrder sysOrder);

    /**
     * 修改数据
     *
     * @param sysOrder 实例对象
     * @return 实例对象
     */
    SysOrder update(SysOrder sysOrder);

    /**
     * 通过主键删除数据
     *
     * @param oid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer oid);

}