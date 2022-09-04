package com.geekarchitect.patterns.command.demo03;

import java.util.Map;

/**
 * app客户端
 *
 * @author 极客架构师@吴念
 * @createTime 2022/8/31
 */
public interface IAppClientV2 {
    void offline(Map<String, String> para);
}
