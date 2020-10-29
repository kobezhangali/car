package com.ali.service;

import com.ali.entity.SysCity;

import java.util.List;

/**
 * (SysCity)表服务接口
 *
 * @author makejava
 * @since 2020-10-28 11:24:15
 */
public interface SysCityService {

    /**
     * 通过ID查询单条数据
     *
     * @param cityid 主键
     * @return 实例对象
     */
    SysCity queryById(Integer cityid);

    List<SysCity> queryCart();

    List<SysCity> queryCartByPid(int pid);

    List<SysCity> queryCartAddressByCityid(int cityid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysCity> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysCity 实例对象
     * @return 实例对象
     */
    SysCity insert(SysCity sysCity);

    /**
     * 修改数据
     *
     * @param sysCity 实例对象
     * @return 实例对象
     */
    SysCity update(SysCity sysCity);

    /**
     * 通过主键删除数据
     *
     * @param cityid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer cityid);

}