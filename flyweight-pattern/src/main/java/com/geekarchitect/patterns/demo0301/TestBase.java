package com.geekarchitect.patterns.demo0301;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试基类
 * @author 极客架构师@吴念
 * @createTime 2022/5/6
 */
public abstract class TestBase {
    private static final Logger LOG = LoggerFactory.getLogger(TestBase.class);
    protected List<Area> arrayList = new ArrayList<>();

    public TestBase() {
        init();
    }

    /**
     * 初始化省份和城市
     */
    private void init() {
        arrayList = JSON.parseArray(AreaJson.CITY_JSON, Area.class);
    }

    /**
     * 生成手机号
     * @param id
     * @param mobile
     * @return
     */
    public abstract IMobileInfo generateMobile(Long id, String mobile);

    /**
     * 返回版本信息
     *
     * @return
     */
    public abstract String getVersion();

    /**
     * 载入手机号：这里使用了模板方法模式
     *
     * @param
     */
    public void loadMobile(int maxNumber) {
        LOG.info(getVersion());
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
