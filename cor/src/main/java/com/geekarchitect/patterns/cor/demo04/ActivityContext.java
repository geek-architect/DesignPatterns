package com.geekarchitect.patterns.cor.demo04;


import com.geekarchitect.patterns.cor.demo02.Activity;
import com.geekarchitect.patterns.cor.demo02.Member;
import lombok.Data;
import org.apache.commons.chain.impl.ContextBase;

/**
 * 请求角色：
 * 既封装请求参数，又封装处理结果
 *
 * @author 极客架构师@吴念
 * @createTime 2022/9/16
 */
@Data
public class ActivityContext extends ContextBase {
    public static String MEMBER_KEY="member";
    private Member member;
    private Activity activity;
    //处理结果
    private boolean result;
}
