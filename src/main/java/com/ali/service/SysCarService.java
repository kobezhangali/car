package com.ali.service;

import com.ali.entity.SysCar;

import java.util.List;

/**
 * (SysCar)表服务接口
 *
 * @author makejava
 * @since 2020-10-28 11:24:14
 */
public interface SysCarService {

    List<SysCar> queryAll(SysCar sysCar);
    List<SysCar> ascCar();
    List<SysCar> descCar();


    /**
     * 通过ID查询单条数据
     *
     * @param carid 主键
     * @return 实例对象
     */
    SysCar queryById(Integer carid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysCar> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysCar 实例对象
     * @return 实例对象
     */
    SysCar insert(SysCar sysCar);

    /**
     * 修改数据
     *
     * @param sysCar 实例对象
     * @return 实例对象
     */
    SysCar update(SysCar sysCar);

    /**
     * 通过主键删除数据
     *
     * @param carid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer carid);

}