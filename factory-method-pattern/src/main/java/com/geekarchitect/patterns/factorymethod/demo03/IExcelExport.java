package com.geekarchitect.patterns.factorymethod.demo03;

import java.util.List;

/**
 * 抽象产品
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/13
 */
public interface IExcelExport {
    void exportExcel(List<SKU> skuList);
}
