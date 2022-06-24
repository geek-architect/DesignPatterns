package com.geekarchitect.patterns.factorymethod.demo04;

/**
 * 抽象产品
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/18
 */
public interface IFileTitleRow {
    /**
     * 获取标题长度
     *
     * @return
     */
    int getTitleLength();

    /**
     * 获取未格式化的标题内容
     *
     * @return
     */
    String getRawContent();
}
