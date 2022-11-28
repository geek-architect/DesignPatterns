package com.geekarchitect.patterns.iterator.collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/11
 */
public class TimeMachine {
    private static final Logger LOG = LoggerFactory.getLogger(TimeMachine.class);
    public void demo1(Vector<String> geekArchitectPrograms){
        LOG.info("JDK第一代迭代器 java1.0");
        Enumeration<String> enumeration=geekArchitectPrograms.elements();
        while(enumeration.hasMoreElements()){
            String programName=enumeration.nextElement();
            LOG.info(programName);
        }
    }
    public void demo2(List<String> geekArchitectPrograms){
        LOG.info("JDK第二代迭代器 java1.2");
        Iterator<String> iterator=geekArchitectPrograms.iterator();
        while (iterator.hasNext()){
            String programName=iterator.next();
            LOG.info(programName);
        }
    }
    public void demo3(List<String> geekArchitectPrograms){
        LOG.info("JDK第二代迭代器 java5");
        for(String programName:geekArchitectPrograms){
            LOG.info(programName);
        }
    }
    public void demo4(List<String> geekArchitectPrograms){
        LOG.info("JDK第三代迭代器 java8 方式1");
        geekArchitectPrograms.iterator().forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                LOG.info(s);
            }
        });
    }
    public void demo5(List<String> geekArchitectPrograms){
        LOG.info("JDK第三代迭代器 java8 方式2");
        geekArchitectPrograms.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                LOG.info(s);
            }
        });
    }

    public void demo6(List<String> geekArchitectPrograms){
        LOG.info("JDK第三代迭代器 java8 方式3");
        geekArchitectPrograms.forEach(programName->LOG.info(programName));
    }
    public void demo7(List<String> geekArchitectPrograms){
        LOG.info("JDK第三代迭代器 java8 方式4");
        geekArchitectPrograms.stream().forEach(LOG::info);
    }

}
