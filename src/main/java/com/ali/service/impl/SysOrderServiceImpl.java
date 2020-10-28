package com.ali.service.impl;

import com.ali.dao.SysOrderDao;
import com.ali.entity.SysOrder;
import com.ali.service.SysOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysOrder)表服务实现类
 *
 * @author makejava
 * @since 2020-10-28 11:24:16
 */
@Service("sysOrderService")
public class SysOrderServiceImpl implements SysOrderService {
    @Resource
    private SysOrderDao sysOrderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param oid 主键
     * @return 实例对象
     */
    @Override
    public SysOrder queryById(Integer oid) {
        return this.sysOrderDao.queryById(oid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<SysOrder> queryAllByLimit(int offset, int limit) {
        return this.sysOrderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysOrder 实例对象
     * @return 实例对象
     */
    @Override
    public SysOrder insert(SysOrder sysOrder) {
        this.sysOrderDao.insert(sysOrder);
        return sysOrder;
    }

    /**
     * 修改数据
     *
     * @param sysOrder 实例对象
     * @return 实例对象
     */
    @Override
    public SysOrder update(SysOrder sysOrder) {
        this.sysOrderDao.update(sysOrder);
        return this.queryById(sysOrder.getOid());
    }

    /**
     * 通过主键删除数据
     *
     * @param oid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer oid) {
        return this.sysOrderDao.deleteById(oid) > 0;
    }
}