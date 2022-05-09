package com.geekarchitect.patterns.demo0305;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 元角色：只保持内部状态信息
 *
 * @author 极客架构师@吴念
 * @createTime 2022/5/7
 */
@Data
public class FlyweightRole {
    private static final Logger LOG = LoggerFactory.getLogger(FlyweightRole.class);
    private String intrinsicState1;
    private String intrinsicState2;

    public void server(FineGrainedRole fineGrainedRole) {
        LOG.info("内部状态：{} 外部状态：{}", intrinsicState1 + intrinsicState2, fineGrainedRole.getExtrinsicState1() + fineGrainedRole.getExtrinsicState2());
    }
}
