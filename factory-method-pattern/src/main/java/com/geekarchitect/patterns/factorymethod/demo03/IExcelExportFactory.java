package com.geekarchitect.patterns.factorymethod.demo03;

/**
 * 抽象工厂：接口
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/15
 */
public interface IExcelExportFactory {
    IExcelExport createExcelExport();
}
