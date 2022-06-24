package com.geekarchitect.patterns.factorymethod.demo04;

import com.geekarchitect.patterns.factorymethod.demo03.SKU;

import java.util.List;

/**
 * 抽象产品
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/18
 */
public interface IDataRow {
    int getRowCount();

    List<SKU> getData();
}
