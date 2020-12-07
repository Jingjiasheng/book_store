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


    @Override
    public Integer getCityCount() {
        return null;
    }

    @Override
    public List<City> getCityList() {
        return null;
    }

    @Override
    public List<City> getCityListByLimit(Integer offset, Integer pageSize) {
        return null;
    }

    @Override
    public City getCityByCityId(Integer cityId) {
        return null;
    }

    @Override
    public City addCity(City city) {
        return null;
    }

    @Override
    public City updateCityByCityId(City city) {
        return null;
    }

    @Override
    public Integer deleteCityById(Integer cityId) {
        return null;
    }
}