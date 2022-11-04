package com.geekarchitect.patterns.visitor.demo01;

import lombok.Data;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/2
 */
@Data
public class FileInfo {
    private int total;

    public void increase() {
        total++;
    }
}
