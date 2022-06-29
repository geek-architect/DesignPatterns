package com.geekarchitect.patterns.abstractfactory.demo02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体工厂
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/21
 */
public class RussiaFileExportFactory extends AbstractFileExportFactory {
    private static final Logger LOG = LoggerFactory.getLogger(RussiaFileExportFactory.class);

    @Override
    public IExcelExport createExcelExport(FileType fileType) {
        switch (fileType) {
            case RUSSIA_EXCEL_2003:
                LOG.info("创建俄罗斯-excel2003文件导出对象");
                return new RussiaExcel2003Export();
            case RUSSIA_EXCEL_2007:
                LOG.info("创建俄罗斯-excel2007文件导出对象");
                return new RussiaExcel2007Export();
            default:
        }
        return null;
    }

    @Override
    public ISqlExport createSqlExport(FileType fileType) {
        switch (fileType) {
            case RUSSIA_MYSQL:
                LOG.info("创建俄罗斯-mysql文件导出对象");
                return new RussiaMysqlExport();
            case RUSSIA_ORACLE:
                LOG.info("创建俄罗斯-oracle文件导出对象");
                return new RussiaOracleExport();
            default:
        }
        return null;
    }
}
