package com.geekarchitect.patterns.abstractfactory.demo03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/6/13
 */
public class FileExportService {
    private static final Logger LOG = LoggerFactory.getLogger(FileExportService.class);

    public void exportFile(List<SKU> skuList) {
        LOG.info("文件导出服务");
        IFileExportFactory fileExportFactory = new FranceFileExportFactory();
        IExcelExport excelExport = fileExportFactory.createExcelExport(FileType.FRANCE_EXCEL_2003);
        ISqlExport sqlExport = fileExportFactory.createSqlExport(FileType.FRANCE_MYSQL);
        IPDFExport pdfExport = fileExportFactory.createPDFExport();
        excelExport.exportExcel(skuList);
        sqlExport.exportSql(skuList);
        pdfExport.exportPDF(skuList);
    }

}
