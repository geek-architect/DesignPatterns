package com.geekarchitect.patterns.simplefactory.demo03;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/6/13
 */
public interface IExcelExport {
    void exportExcel(List<SKU> skuList);
}
