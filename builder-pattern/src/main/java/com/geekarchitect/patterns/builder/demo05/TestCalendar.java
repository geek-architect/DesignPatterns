package com.geekarchitect.patterns.builder.demo05;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static java.util.Calendar.*;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/7/25
 */
public class TestCalendar {
    private static final Logger LOG = LoggerFactory.getLogger(TestCalendar.class);

    public static void main(String[] args) {
        TestCalendar testCalendar = new TestCalendar();
        testCalendar.demo01();
        testCalendar.demo02();
    }

    public void demo01() {
        Calendar calendar =
                Calendar.getInstance();
        calendar.set(YEAR, 2022);
        calendar.set(MONTH, JULY);
        calendar.set(DATE, 7);
        calendar.set(HOUR, 1);
        calendar.set(MINUTE, 5);
        calendar.set(SECOND, 10);
        calendar.set(AM_PM, PM);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        LOG.info("calendar传统用法案例 {}", sdf.format(calendar.getTime()));
    }

    public void demo02() {
        Calendar calendar = new Calendar.Builder()
                .set(YEAR, 2022)
                .set(MONTH, JULY)
                .set(DATE, 7)
                .set(HOUR, 1)
                .set(MINUTE, 5)
                .set(SECOND, 10)
                .set(AM_PM, PM).build();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        LOG.info("calendar JDK1.8 新用法案例 {}", sdf.format(calendar.getTime()));
    }
}
