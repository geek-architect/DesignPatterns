package com.geekarchitect.patterns.demo0301;

import java.util.HashMap;
import java.util.Map;

/**
 * 手机号池实现类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/29
 */
public class MobilePool implements IMobilePool {
    private static final Map<String, IMobileInfo> mobileInfoMap = new HashMap<>();
    private static final MobilePool mobilePool = new MobilePool();

    private MobilePool() {
    }

    public static MobilePool getInstance() {
        return mobilePool;
    }

    @Override
    public boolean exists(String mobile) {
        return mobileInfoMap.containsKey(mobile);
    }

    @Override
    public void add(IMobileInfo mobileInfo) {
        mobileInfoMap.put(mobileInfo.getMobile(), mobileInfo);
    }

    @Override
    public void delete(String mobile) {
        mobileInfoMap.remove(mobile);
    }

}
