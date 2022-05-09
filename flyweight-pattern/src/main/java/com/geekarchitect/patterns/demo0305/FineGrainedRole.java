package com.geekarchitect.patterns.demo0305;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 细粒度角色：原本包含了所有状态，抽取了元角色之后，它只负责外部状态。
 *
 * @author 极客架构师@吴念
 * @createTime 2022/5/9
 */
@Data
public class FineGrainedRole {
    private static final Logger LOG = LoggerFactory.getLogger(FineGrainedRole.class);
    private String extrinsicState1;
    private String extrinsicState2;
    private String intrinsicState1;
    private String intrinsicState2;

    public void server() {
        LOG.info("内部状态：{} 外部状态：{}", getIntrinsicState1() + getIntrinsicState2(), getExtrinsicState1() + getExtrinsicState2());
    }
}
