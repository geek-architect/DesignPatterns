package com.geekarchitect.patterns.factorymethod.demo04;

import com.geekarchitect.patterns.factorymethod.demo03.SKU;

import java.util.List;

/**
 * 抽象工厂：接口
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/15
 */
public interface IExcelExportFactory {
    /**
     * 工厂方法
     *
     * @return
     */
    IExcelFile createExcel();

    /**
     * 工厂方法
     *
     * @return
     */
    IFileTitleRow createFileTitleRow();

    /**
     * 工厂方法
     *
     * @return
     */
    ITableTitleRow createTableTitleRow();

    /**
     * 工厂方法
     *
     * @return
     */
    IDataRow createDataRow();

    /**
     * 工厂方法
     *
     * @return
     */
    ITotalRow createTotalRow();

    /**
     * 模板方法模式：模板方法
     *
     * @param skuList
     */
    void exportExcel(List<SKU> skuList);
}
