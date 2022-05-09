package com.geekarchitect.patterns.demo0302;

import com.geekarchitect.patterns.demo0301.Area;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 元工厂
 *
 * @author 极客架构师@吴念
 * @createTime 2022/5/3
 */
public class FlyweightFactory {
    private static final Logger LOG = LoggerFactory.getLogger(FlyweightFactory.class);
    private static final FlyweightFactory flyweightFactory = new FlyweightFactory();
    private static final Map<Long, Area> AREA_MAP = new HashMap<>();

    private FlyweightFactory() {
    }

    public static FlyweightFactory getInstance() {
        return flyweightFactory;
    }

    public Area getArea(Area area) {
        if (AREA_MAP.containsKey(area.getCityCode())) {
            return AREA_MAP.get(area.getCityCode());
        }
        LOG.info("城市{}首次访问，加入缓存", area);
        AREA_MAP.put(area.getCityCode(), area);
        return area;
    }

    public Area getArea(Long cityCode) {
        return AREA_MAP.get(cityCode);
    }

}
