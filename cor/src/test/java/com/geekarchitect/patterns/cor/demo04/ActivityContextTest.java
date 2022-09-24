package com.geekarchitect.patterns.cor.demo04;

import com.geekarchitect.patterns.cor.demo02.Activity;
import com.geekarchitect.patterns.cor.demo02.Member;
import com.geekarchitect.patterns.cor.demo03.ActivityControllerV2;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class ActivityContextTest {
    private static final Logger LOG = LoggerFactory.getLogger(ActivityContextTest.class);
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testMapStyle() {
        LOG.info("map-style风格");
        ActivityContext activityContext=new ActivityContext();
        Member member=new Member();
        member.setId(1L);
        activityContext.put(ActivityContext.MEMBER_KEY,member);
        Member result1=(Member)activityContext.get(ActivityContext.MEMBER_KEY);
        LOG.info("result1={}",result1.toString());

        Member result2=activityContext.getMember();
        LOG.info("result2={}",result2.toString());
    }

    @Test
    void testJavaBeanStyle() {
        LOG.info("JavaBean风格");
        ActivityContext activityContext=new ActivityContext();
        Member member=new Member();
        member.setId(1L);
        activityContext.setMember(member);
        Member result1=(Member)activityContext.get(ActivityContext.MEMBER_KEY);
        LOG.info("result1={}",result1.toString());

        Member result2=activityContext.getMember();
        LOG.info("result2={}",result2.toString());
    }
    @Test
    void testTypeSafe() {
        LOG.info("数据类型安全问题");
        ActivityContext activityContext=new ActivityContext();
        Activity activity=new Activity();
        activity.setId(2L);
        //key对应的value，数据类型错误，抛出异常
        activityContext.put(ActivityContext.MEMBER_KEY,activity);
        Member result1=(Member)activityContext.get(ActivityContext.MEMBER_KEY);
        LOG.info("result1={}",result1.toString());

        Member result2=activityContext.getMember();
        LOG.info("result2={}",result2.toString());
    }
}