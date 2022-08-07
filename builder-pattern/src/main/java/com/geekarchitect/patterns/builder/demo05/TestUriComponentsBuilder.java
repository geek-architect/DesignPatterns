package com.geekarchitect.patterns.builder.demo05;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/7/26
 */
public class TestUriComponentsBuilder {
    private static final Logger LOG = LoggerFactory.getLogger(TestUriComponentsBuilder.class);
    public static void main(String[] args) {
        TestUriComponentsBuilder testUriComponentsBuilder=new TestUriComponentsBuilder();
        testUriComponentsBuilder.demo01();

    }
    public void demo01(){
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("space.bilibili.com")
                .path("//1135139396/search/video")
                .queryParam("keyword", "设计模式")
                .build();
        LOG.info("UriComponentsBuilder 案例");
        LOG.info("URL = {}",uriComponents.toUri());
    }
}
