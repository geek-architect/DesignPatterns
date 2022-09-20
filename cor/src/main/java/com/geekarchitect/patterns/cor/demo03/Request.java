package com.geekarchitect.patterns.cor.demo03;

import com.geekarchitect.patterns.cor.demo02.Activity;
import com.geekarchitect.patterns.cor.demo02.Member;
import lombok.Data;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/9/16
 */
@Data
public class Request {
    private Member member;
    private Activity activity;
}
