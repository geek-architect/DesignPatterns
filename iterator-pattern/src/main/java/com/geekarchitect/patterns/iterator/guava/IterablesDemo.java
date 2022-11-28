package com.geekarchitect.patterns.iterator.guava;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/8
 */
public class IterablesDemo {
    private static final Logger LOG = LoggerFactory.getLogger(IterablesDemo.class);

    /**
     * 合并集合并迭代
     */
    public void concat(){
        List<Integer> list1 = Lists.newArrayList(1, 2, 3);
        List<Integer> list2 = Lists.newArrayList(4, 5, 6);
        List<Integer> list3 = Lists.newArrayList(7, 8);

        Iterable<Integer> iterable = Iterables.concat(list1, list2, list3);
        Iterator<Integer> iterator= iterable.iterator();
        while (iterator.hasNext()){
            LOG.info(iterator.next().toString());
        }
    }

    /**
     * 分区迭代，可以模拟类似分页或者其他批量操作的业务场景
     */
    public void partition(){
        List<Integer> list1 = Lists.newArrayList(1, 2,3,4,5,6,7,8,9,10,11);
        Iterable<Integer> iterable1 = Iterables.concat(list1);
        Iterable<List<Integer>> iterable2= Iterables.partition(iterable1,5);
        Iterator<List<Integer>> iterator1=iterable2.iterator();
        while (iterator1.hasNext()){
            LOG.info(iterator1.next().toString());
        }
    }



}
