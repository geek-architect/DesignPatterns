package com.geekarchitect.patterns.demo0303;

import com.geekarchitect.patterns.demo0301.City;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 元对象工厂-guava
 *
 * @author 极客架构师@吴念
 * @createTime 2022/5/3
 */
public class FlyweightFactoryV2 {
    private static final Logger LOG = LoggerFactory.getLogger(FlyweightFactoryV2.class);
    private static final FlyweightFactoryV2 flyweightFactory = new FlyweightFactoryV2();
    private static final Map<Long, City> cityMap = new HashMap<>();

    private FlyweightFactoryV2() {
    }

    public static FlyweightFactoryV2 getInstance() {
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
