package com.geekarchitect.patterns.prototype.demo03;

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
        SimpleDateFormat sdf = new
                SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

        Calendar calendar02 = (Calendar) calendar.clone();
        LOG.info("Calendar案例");
        LOG.info("before:");
        LOG.info("calendar {}", sdf.format(calendar.getTime()));
        LOG.info("calendar02 {}", sdf.format(calendar02.getTime()));

        calendar.set(YEAR, 2023);
        calendar02.set(YEAR, 2024);

        LOG.info("after:");
        LOG.info("calendar {}", sdf.format(calendar.getTime()));
        LOG.info("calendar02 {}", sdf.format(calendar02.getTime()));

    }

}
