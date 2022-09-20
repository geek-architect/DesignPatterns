package com.geekarchitect.patterns.cor.demo02;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/9/16
 */
public interface IVerification {
    Boolean isPlus(Member member);

    Boolean hasFollowedShop(Member member, Activity activity);

    Boolean HasBought(Member member, Activity activity);
}
