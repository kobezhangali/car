package com.ali.service.impl;

import com.ali.dao.SysCityDao;
import com.ali.entity.SysCity;
import com.ali.service.SysCityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysCity)表服务实现类
 *
 * @author makejava
 * @since 2020-10-28 11:24:15
 */
@Service("sysCityService")
public class SysCityServiceImpl implements SysCityService {
    @Resource
    private SysCityDao sysCityDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cityid 主键
     * @return 实例对象
     */
    @Override
    public SysCity queryById(Integer cityid) {
        return this.sysCityDao.queryById(cityid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<SysCity> queryAllByLimit(int offset, int limit) {
        return this.sysCityDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysCity 实例对象
     * @return 实例对象
     */
    @Override
    public SysCity insert(SysCity sysCity) {
        this.sysCityDao.insert(sysCity);
        return sysCity;
    }

    /**
     * 修改数据
     *
     * @param sysCity 实例对象
     * @return 实例对象
     */
    @Override
    public SysCity update(SysCity sysCity) {
        this.sysCityDao.update(sysCity);
        return this.queryById(sysCity.getCityid());
    }

    /**
     * 通过主键删除数据
     *
     * @param cityid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer cityid) {
        return this.sysCityDao.deleteById(cityid) > 0;
    }
}