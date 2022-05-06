package com.geekarchitect.patterns.demo0003;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/3/4
 */
public abstract class AbstractTemplateRoleService implements IRoleService {
    @Override
    public final void templateMethod() {
        individuationMethod1();
        individuationMethod2();
        hookMethod();
    }

    /**
     * 钩子方法，可以被重定义
     *
     * @author: 极客架构师@吴念
     * @date: 2022/3/4
     * @param: []
     * @return: void
     */
    @Override
    public void hookMethod() {

    }
}
