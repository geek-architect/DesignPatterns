package com.geekarchitect.patterns.demo0101;

import lombok.Data;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/4/2
 */
@Data
public class Member {
    private Long id;
    private String nickName;
    private boolean plus;

    public Member() {
    }

    public Member(Long id, String nickName, boolean plus) {
        this.id = id;
        this.nickName = nickName;
        this.plus = plus;
    }
}
