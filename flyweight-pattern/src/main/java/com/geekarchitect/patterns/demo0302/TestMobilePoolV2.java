package com.geekarchitect.patterns.demo0302;

import com.alibaba.fastjson.JSON;
import com.geekarchitect.patterns.demo0301.City;
import com.geekarchitect.patterns.demo0301.CityJson;
import com.geekarchitect.patterns.demo0301.IMobileInfo;
import com.geekarchitect.patterns.demo0301.MobilePool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * 第二版代码：基于享元模式 测试类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/29
 */
public class TestMobilePoolV2 {
    private static final Logger LOG = LoggerFactory.getLogger(TestMobilePoolV2.class);
    private List<City> cityList = new ArrayList<>();

    public TestMobilePoolV2() {
        init();
    }

    public static void main(String[] args) {
        int maxNumber = 10000;
        if (null != args && args.length > 0) {
            maxNumber = Integer.parseInt(args[0]);
        }
        //maxNumber=0;
        TestMobilePoolV2 testMobilePool = new TestMobilePoolV2();
        testMobilePool.loadMobile(maxNumber);
    }

    /**
     * 初始化省份和城市
     */
    private void init() {
        cityList = JSON.parseArray(CityJson.CITY_JSON, City.class);
        for (City city : cityList
        ) {
            LOG.info("解析json数据文件：{}", city.toString());
        }
    }

    /**
     * 载入手机号
     *
     * @param
     */
    public void loadMobile(int maxNumber) {
        LOG.info("第二版代码：基于享元模式");
        long startMobile = 18700000001L;
        long mobileId = 1L;
        if (maxNumber > 0) {
            LOG.info("预计导入{}个手机号码", maxNumber);
        } else {
            LOG.info("预计导入海量手机号，直至内存溢出");
        }
        while (true) {
            IMobileInfo mobileInfo = generateMobile(mobileId, String.valueOf(startMobile));
            MobilePool.getInstance().add(mobileInfo);
            if (mobileId % 1000 == 0) {
                LOG.info("手机信息{}", mobileInfo.toString());
                LOG.info("已载入{}个手机号", mobileId);
            }
            if (maxNumber > 0 && mobileId == maxNumber) {
                break;
            }
            startMobile++;
            mobileId++;
        }
        LOG.info("号码导入完成，共导入{}个号码。", maxNumber);
    }

    public IMobileInfo generateMobile(Long id, String mobile) {
        //初始化省份及城市信息
        City city = cityList.get(new Random().nextInt(cityList.size()));

        city = FlyweightFactory.getInstance().getCity(city);
        IMobileInfo mobileInfo = new MobileInfoV2(city.getCityCode());
        mobileInfo.setId(id);
        mobileInfo.setMobile(mobile);
        mobileInfo.setAddDate(new Date());
        return mobileInfo;
    }

}
