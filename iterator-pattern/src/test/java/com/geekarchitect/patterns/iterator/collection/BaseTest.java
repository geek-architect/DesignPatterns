package com.geekarchitect.patterns.iterator.collection;

import org.assertj.core.util.Lists;

import java.util.List;
import java.util.Vector;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/11
 */
public abstract class BaseTest {
    public Vector<String> mockGeekArchitectProgramVector(){
        Vector<String> geekArchitectsProgramsVector=new Vector<>();
        geekArchitectsProgramsVector.add("《架构师系列...》");
        geekArchitectsProgramsVector.add("《极客系列...》");
        geekArchitectsProgramsVector.add("《架构师书房》");
        geekArchitectsProgramsVector.add("《源码说》");
        geekArchitectsProgramsVector.add("《极客兵器谱》");
        return geekArchitectsProgramsVector;
    }
    public List<String> mockGeekArchitectProgramList(){
        return Lists.newArrayList("《架构师系列...》","《极客系列...》","《架构师书房》","《源码说》","《极客兵器谱》");
    }
}
