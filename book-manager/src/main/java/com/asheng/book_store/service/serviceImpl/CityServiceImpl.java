package com.asheng.book_store.service.serviceImpl;

import com.asheng.book_store.dao.CityDao;
import com.asheng.book_store.domain.City;
import com.asheng.book_store.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (City)表服务实现类
 *
 * @author makejava
 * @since 2020-12-02 14:35:26
 */
@Service("cityService")
public class CityServiceImpl implements CityService {
    @Resource
    private CityDao cityDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cityId 主键
     * @return 实例对象
     */
    @Override
    public City queryById(Integer cityId) {
        return this.cityDao.queryById(cityId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<City> queryAllByLimit(int offset, int limit) {
        return this.cityDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param city 实例对象
     * @return 实例对象
     */
    @Override
    public City insert(City city) {
        this.cityDao.insert(city);
        return city;
    }

    /**
     * 修改数据
     *
     * @param city 实例对象
     * @return 实例对象
     */
    @Override
    public City update(City city) {
        this.cityDao.update(city);
        return this.queryById(city.getCityId());
    }

    /**
     * 通过主键删除数据
     *
     * @param cityId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer cityId) {
        return this.cityDao.deleteById(cityId) > 0;
    }
}