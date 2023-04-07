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
        LOG.info("导出中文Mysql文件");
        ISqlExport sqlExport=new MysqlExport();
        IFileExport fileExport=new ChinaFileExport(sqlExport);
        fileExport.exportSql(skuList);

        LOG.info("导出俄罗斯Excel2003文件");
        IExcelExport excelExport=new Excel2003Export();
        fileExport=new RussiaFileExport();
        fileExport.setExcelExport(excelExport);
        fileExport.exportExcel(skuList);
    }

}
