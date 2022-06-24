package com.geekarchitect.patterns.factorymethod.demo03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/6/13
 */
public class FileExportService {
    private static final Logger LOG = LoggerFactory.getLogger(FileExportService.class);

    public void exportExcel(List<SKU> skuList, FileType fileType) {
        LOG.info("文件导出服务");
        IExcelExportFactory excelExportFactory = null;
        IExcelExport excelExport = null;
        switch (fileType) {
            case EXCEL_2003:
                excelExportFactory = new Excel2003ExportFactory();
                break;
            case EXCEL_2007:
                excelExportFactory = new Excel2007ExportFactory();
                break;
        }
        if (null != excelExportFactory) {
            excelExport = excelExportFactory.createExcelExport();
            excelExport.exportExcel(skuList);
        } else {
            LOG.info("不支持的文件类型");
        }

    }

}
