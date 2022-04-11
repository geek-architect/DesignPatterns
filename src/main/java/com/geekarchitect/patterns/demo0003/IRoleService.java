package com.geekarchitect.patterns.demo0003;

/**
 * 角色服务接口
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/4
 */
public interface IRoleService {
    /**
     * 模板方法
     */
    void templateMethod();

    /**
     * 个性化方法1
     */
    void individuationMethod1();

    /**
     * 个性化方法2
     */
    void individuationMethod2();

    /**
     * 钩子方法
     */
    void hookMethod();

}
