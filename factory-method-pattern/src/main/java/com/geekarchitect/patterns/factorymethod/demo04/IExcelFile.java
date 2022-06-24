package com.geekarchitect.patterns.factorymethod.demo04;

/**
 * 抽象产品：接口
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/18
 */
public interface IExcelFile {
    void addFileTitleRow(IFileTitleRow fileTitleRow);

    void addTableTitleRow(ITableTitleRow tableTitleRow);

    void addDataRow(IDataRow dataRow);

    void addTotalRow(ITotalRow totalRow);
}
