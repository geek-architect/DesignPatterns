package com.geekarchitect.patterns.bridge.demo03;

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
        IExcelExport excelExport=new Excel2003Export();
        IFileExport fileExport=new ChinaFileExport(excelExport);
        fileExport.exportExcel(skuList);

        ISqlExport sqlExport=new MysqlExport();
        fileExport.setSqlExport(sqlExport);
        fileExport.exportSql(skuList);
    }

}
