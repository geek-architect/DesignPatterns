package com.geekarchitect.patterns.simplefactory.demo04;

import com.geekarchitect.patterns.simplefactory.demo03.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/6/13
 */
public class FileExportServiceV2 {
    private static final Logger LOG = LoggerFactory.getLogger(FileExportServiceV2.class);
    public void exportFile(List<SKU> skuList,FileType fileType){
        LOG.info("文件导出服务");
        IExcelExport excelExport=SimpleFactory.createExcelExport(fileType);
        excelExport.exportExcel(skuList);
    }
}
