package com.geekarchitect.patterns.demo0305;

import lombok.Data;

/**
 * 非共享的元角色：它里面包含所有状态，所以无法共享，与细粒度对象fineGrainedRole作用完全一样，不同之处是，它强调了非共享性。
 * 一般很少使用。
 *
 * @author 极客架构师@吴念
 * @createTime 2022/5/7
 */
@Data
public class UnsharedFlyweightRole {
    private String intrinsicState1;
    private String intrinsicState2;
    private FineGrainedRole fineGrainedRole;

    public UnsharedFlyweightRole(FineGrainedRole fineGrainedRole) {
        this.fineGrainedRole = fineGrainedRole;
    }

    public void server() {
    }
}
