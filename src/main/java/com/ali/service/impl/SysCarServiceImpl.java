package com.ali.service.impl;

import com.ali.dao.SysCarDao;
import com.ali.entity.SysCar;
import com.ali.service.SysCarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysCar)表服务实现类
 *
 * @author makejava
 * @since 2020-10-28 11:24:14
 */
@Service("sysCarService")
public class SysCarServiceImpl implements SysCarService {
    @Resource
    private SysCarDao sysCarDao;

    @Override
    public List<SysCar> queryAll(SysCar sysCar) {
        return this.sysCarDao.queryAll(sysCar);
    }

    @Override
    public List<SysCar> ascCar() {
        return this.sysCarDao.ascCar();
    }

    @Override
    public List<SysCar> descCar() {
        return this.sysCarDao.descCar();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param carid 主键
     * @return 实例对象
     */
    @Override
    public SysCar queryById(Integer carid) {
        return this.sysCarDao.queryById(carid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<SysCar> queryAllByLimit(int offset, int limit) {
        return this.sysCarDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysCar 实例对象
     * @return 实例对象
     */
    @Override
    public SysCar insert(SysCar sysCar) {
        this.sysCarDao.insert(sysCar);
        return sysCar;
    }

    /**
     * 修改数据
     *
     * @param sysCar 实例对象
     * @return 实例对象
     */
    @Override
    public SysCar update(SysCar sysCar) {
        this.sysCarDao.update(sysCar);
        return this.queryById(sysCar.getCarid());
    }

    /**
     * 通过主键删除数据
     *
     * @param carid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer carid) {
        return this.sysCarDao.deleteById(carid) > 0;
    }
}