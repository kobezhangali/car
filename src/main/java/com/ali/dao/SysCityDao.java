package com.ali.dao;

import com.ali.entity.SysCity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (SysCity)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-28 11:24:15
 */
public interface SysCityDao {

    /**
     * 通过ID查询单条数据
     *
     * @param cityid 主键
     * @return 实例对象
     */
    SysCity queryById(Integer cityid);
    /*查询城市*/
    SysCity getcity();
    /*通过pid查询城市*/
    List<SysCity> queryByPid(int pid);


    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysCity> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysCity 实例对象
     * @return 对象列表
     */
    List<SysCity> queryAll(SysCity sysCity);

    /**
     * 新增数据
     *
     * @param sysCity 实例对象
     * @return 影响行数
     */
    int insert(SysCity sysCity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysCity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SysCity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysCity> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<SysCity> entities);

    /**
     * 修改数据
     *
     * @param sysCity 实例对象
     * @return 影响行数
     */
    int update(SysCity sysCity);

    /**
     * 通过主键删除数据
     *
     * @param cityid 主键
     * @return 影响行数
     */
    int deleteById(Integer cityid);

}