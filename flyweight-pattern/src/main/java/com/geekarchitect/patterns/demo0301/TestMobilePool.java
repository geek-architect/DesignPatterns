package com.geekarchitect.patterns.demo0301;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * 第一版代码：普通方式 测试类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/29
 */
public class TestMobilePool {
    private static final Logger LOG = LoggerFactory.getLogger(TestMobilePool.class);
    private List<City> cityList = new ArrayList<>();

    public TestMobilePool() {
        init();
    }

    public static void main(String[] args) {
        int maxNumber = 10000;
        if (null != args && args.length > 0) {
            maxNumber = Integer.parseInt(args[0]);
        }
        //maxNumber=0;
        TestMobilePool testMobilePool = new TestMobilePool();
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

    public IMobileInfo generateMobile(Long id, String mobile) {
        IMobileInfo mobileInfo = new MobileInfo();
        mobileInfo.setId(id);
        mobileInfo.setMobile(mobile);
        //初始化省份及城市信息
        City city = cityList.get(new Random().nextInt(cityList.size()));
        mobileInfo.setProvinceId(city.getProvinceId());
        mobileInfo.setProvinceName(city.getProvinceName());
        mobileInfo.setProvinceCode(city.getProvinceCode());

        mobileInfo.setCityId(city.getCityId());
        mobileInfo.setCityCode(city.getCityCode());
        mobileInfo.setCityName(city.getCityName());
        mobileInfo.setAddDate(new Date());
        return mobileInfo;
    }

    /**
     * 载入手机号
     *
     * @param
     */
    public void loadMobile(int maxNumber) {
        LOG.info("第一版代码：普通方式");
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

}
