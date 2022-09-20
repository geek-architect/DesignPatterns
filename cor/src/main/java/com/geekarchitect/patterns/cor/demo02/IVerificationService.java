package com.geekarchitect.patterns.cor.demo02;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/9/16
 */
public interface IVerificationService {
    /**
     * 是否有资格参加活动
     *
     * @param member
     * @param activity
     * @return
     */
    Boolean isLegalMember(Member member, Activity activity);
}
