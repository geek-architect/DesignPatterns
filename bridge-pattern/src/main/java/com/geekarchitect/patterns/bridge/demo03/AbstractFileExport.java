package com.geekarchitect.patterns.bridge.demo03;

import java.util.List;

/**
 * 抽象工厂：抽象类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/21
 */
public abstract class AbstractFileExport implements IFileExport {
    protected IExcelExport excelExport;
    protected ISqlExport sqlExport;

    public AbstractFileExport(IExcelExport excelExport) {
        this.excelExport = excelExport;
    }

    public AbstractFileExport(ISqlExport sqlExport) {
        this.sqlExport = sqlExport;
    }

    public AbstractFileExport() {
    }

    @Override
    public void exportExcel(List<SKU> skuList) {
        excelExport.exportExcel(skuList);
    }

    @Override
    public void exportSql(List<SKU> skuList) {
        sqlExport.exportSql(skuList);
    }

    @Override
    public void setExcelExport(IExcelExport excelExport) {
        this.excelExport = excelExport;
    }
    @Override
    public void setSqlExport(ISqlExport sqlExport) {
        this.sqlExport = sqlExport;
    }
}
