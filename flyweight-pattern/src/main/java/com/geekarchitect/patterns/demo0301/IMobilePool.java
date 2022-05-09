package com.geekarchitect.patterns.demo0301;

/**
 * 手机号池接口
 *
 * @author 极客架构师@吴念
 * @createTime 2022/4/29
 */
public interface IMobilePool {


    /**
     * 判断手机号是否存在
     *
     * @param mobile
     * @return
     */
    boolean exists(String mobile);

    /**
     * 添加新号码
     *
     * @author: 极客架构师@吴念
     * @date: 2022/4/30
     * @param: [mobileInfo]
     * @return: void
     */
    void add(IMobileInfo mobileInfo);

    /**
     * @author: 极客架构师@吴念
     * @date: 2022/4/30
     * @param: [mobile]
     * @return: boolean
     */
    IMobileInfo get(String mobile);

}
