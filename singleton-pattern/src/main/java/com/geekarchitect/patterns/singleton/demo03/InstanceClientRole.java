package com.geekarchitect.patterns.singleton.demo03;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/6/1
 */
public class InstanceClientRole {
    public static void main(String[] args) {
        InstanceClientRole instanceClientRole=new InstanceClientRole();
        instanceClientRole.service01();
        instanceClientRole.service02();
    }
    public void service01(){
        EarlyInstance earlyInstance=EarlyInstance.getInstance();
        earlyInstance.doService();
    }
    public void service02(){
        LazyInstance lazyInstance=LazyInstance.getInstance();
        lazyInstance.doService();
    }

}
