package com.geekarchitect.patterns.abstractfactory.demo02;

/**
 * 抽象工厂：接口
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/21
 */
public interface IFileExportFactory {
    IExcelExport createExcelExport(FileType fileType);

    ISqlExport createSqlExport(FileType fileType);
}
