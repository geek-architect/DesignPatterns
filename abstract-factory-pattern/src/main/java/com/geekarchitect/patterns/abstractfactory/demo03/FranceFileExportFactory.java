package com.geekarchitect.patterns.abstractfactory.demo03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体工厂：
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/21
 */
public class FranceFileExportFactory extends AbstractFileExportFactory {
    private static final Logger LOG = LoggerFactory.getLogger(FranceFileExportFactory.class);

    @Override
    public IExcelExport createExcelExport(FileType fileType) {
        switch (fileType) {
            case FRANCE_EXCEL_2003:
                LOG.info("创建法国-excel2003文件导出对象");
                return new FranceExcel2003Export();
            case FRANCE_EXCEL_2007:
                LOG.info("创建法国-excel2007文件导出对象");
                return new FranceExcel2007Export();
            default:
        }
        return null;
    }

    @Override
    public ISqlExport createSqlExport(FileType fileType) {
        switch (fileType) {
            case FRANCE_MYSQL:
                LOG.info("创建法国-mysql文件导出对象");
                return new FranceMysqlExport();
            case FRANCE_ORACLE:
                LOG.info("创建法国-oracle文件导出对象");
                return new FranceOracleExport();
            default:
        }
        return null;
    }

    @Override
    public IPDFExport createPDFExport() {
        LOG.info("创建法国-PDF文件导出对象");
        return new FrancePDFExport();
    }
}
