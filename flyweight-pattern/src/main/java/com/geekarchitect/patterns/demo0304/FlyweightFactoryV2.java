package com.geekarchitect.patterns.demo0304;

import com.geekarchitect.patterns.demo0301.Area;
import com.geekarchitect.patterns.demo0301.AreaJson;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/**
 * 元对象工厂-guava
 *
 * @author 极客架构师@吴念
 * @createTime 2022/5/3
 */
public class FlyweightFactoryV2 {
    private static final Logger LOG = LoggerFactory.getLogger(FlyweightFactoryV2.class);
    private static final FlyweightFactoryV2 flyweightFactory = new FlyweightFactoryV2();
    private static final Cache<Long, Area> AREA_CACHE;

    static {
        AREA_CACHE = CacheBuilder.newBuilder().build();
    }

    private FlyweightFactoryV2() {
    }

    public static FlyweightFactoryV2 getInstance() {
        return flyweightFactory;
    }

    public Area getArea(Area area) {
        Area cachedArea = null;
        try {
            cachedArea = AREA_CACHE.get(Long.valueOf(area.getCityCode()), new Callable<Area>() {

                @Override
                public Area call() throws Exception {
                    Area cachedCity= AreaJson.getAreaByCityCode(area.getCityCode());
                    LOG.info("城市{}首次访问，加入缓存", cachedCity);
                    return cachedCity;
                }
            });
        } catch (ExecutionException e) {
            LOG.error(e.getMessage(), e);
        }
        return cachedArea;
    }

    public Area getArea(long cityCode) {
        Area area=new Area();
        area.setCityCode(cityCode);
        return getArea(area);
    }

}
