package com.geekarchitect.patterns.bridge.demo03;

import java.util.List;

/**
 * 抽象工厂：接口
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/21
 */
public interface IFileExport {
    void exportExcel(List<SKU> skuList);

    void exportSql(List<SKU> skuList);

    public void setExcelExport(IExcelExport excelExport);

    public void setSqlExport(ISqlExport sqlExport);
}
