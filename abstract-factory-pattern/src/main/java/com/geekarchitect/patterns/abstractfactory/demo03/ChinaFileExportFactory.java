package com.geekarchitect.patterns.abstractfactory.demo03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体工厂：
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/21
 */
public class ChinaFileExportFactory extends AbstractFileExportFactory {
    private static final Logger LOG = LoggerFactory.getLogger(ChinaFileExportFactory.class);

    @Override
    public IExcelExport createExcelExport(FileType fileType) {
        switch (fileType) {
            case CHINA_EXCEL_2003:
                LOG.info("创建中国-excel2003文件导出对象");
                return new ChinaExcel2003Export();
            case CHINA_EXCEL_2007:
                LOG.info("创建中国-excel2007文件导出对象");
                return new ChinaExcel2007Export();
            default:
        }
        return null;
    }

    @Override
    public ISqlExport createSqlExport(FileType fileType) {
        switch (fileType) {
            case CHINA_MYSQL:
                LOG.info("创建中国-mysql文件导出对象");
                return new ChinaMysqlExport();
            case CHINA_ORACLE:
                LOG.info("创建中国-oracle文件导出对象");
                return new ChinaOracleExport();
            default:
        }
        return null;
    }

    @Override
    public IPDFExport createPDFExport() {
        return new ChinaPDFExport();
    }
}
