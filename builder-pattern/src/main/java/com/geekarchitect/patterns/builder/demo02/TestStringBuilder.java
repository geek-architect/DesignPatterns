package com.geekarchitect.patterns.builder.demo02;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/7/1
 */
public class TestStringBuilder {
    private static final Logger LOG = LoggerFactory.getLogger(TestStringBuilder.class);
    public static void main(String[] args) {
       TestStringBuilder testStringBuilder=new TestStringBuilder();
       testStringBuilder.demo01();
    }
    public void demo01(){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("今日油价：").append(1).append("升").append(9.5D).append("元人民币");
        LOG.info(stringBuilder.toString());
    }
    public void demo02(){
        Cache<String,String> cache= CacheBuilder.newBuilder().build();
    }
}
