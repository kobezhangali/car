package com.ali.dao;

import com.ali.entity.SysOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (SysOrder)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-28 11:24:16
 */
public interface SysOrderDao {

    /**
     * 通过ID查询单条数据
     *
     * @param oid 主键
     * @return 实例对象
     */
    SysOrder queryById(Integer oid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysOrder> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysOrder 实例对象
     * @return 对象列表
     */
    List<SysOrder> queryAll(SysOrder sysOrder);

    /**
     * 新增数据
     *
     * @param sysOrder 实例对象
     * @return 影响行数
     */
    int insert(SysOrder sysOrder);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysOrder> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SysOrder> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysOrder> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<SysOrder> entities);

    /**
     * 修改数据
     *
     * @param sysOrder 实例对象
     * @return 影响行数
     */
    int update(SysOrder sysOrder);

    /**
     * 通过主键删除数据
     *
     * @param oid 主键
     * @return 影响行数
     */
    int deleteById(Integer oid);

}