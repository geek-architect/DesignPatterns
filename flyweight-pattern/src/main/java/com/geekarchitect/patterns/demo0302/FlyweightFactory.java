package com.geekarchitect.patterns.demo0302;

import com.geekarchitect.patterns.demo0301.City;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 元对象工厂
 *
 * @author 极客架构师@吴念
 * @createTime 2022/5/3
 */
public class FlyweightFactory {
    private static final Logger LOG = LoggerFactory.getLogger(FlyweightFactory.class);
    private static final FlyweightFactory flyweightFactory = new FlyweightFactory();
    private static final Map<Long, City> cityMap = new HashMap<>();

    private FlyweightFactory() {
    }

    public static FlyweightFactory getInstance() {
        return flyweightFactory;
    }

    public City getCity(City city) {
        if (cityMap.containsKey(city.getCityCode())) {
            return cityMap.get(city.getCityCode());
        }
        LOG.info("城市{}首次访问，加入缓存", city);
        cityMap.put(city.getCityCode(), city);
        return city;
    }

    public City getCity(long cityCode) {
        return cityMap.get(cityCode);
    }

}
