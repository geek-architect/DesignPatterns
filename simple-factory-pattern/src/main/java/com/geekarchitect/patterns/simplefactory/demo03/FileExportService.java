package com.geekarchitect.patterns.simplefactory.demo03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/6/13
 */
public class FileExportService {
    private static final Logger LOG = LoggerFactory.getLogger(FileExportService.class);
    public void exportFile(List<SKU> skuList,FileType fileType){
        IExcelExport excelExport=null;
        switch (fileType){
            case EXCEL_2003:
                LOG.info("文件导出服务:excel2003");
                excelExport=new Excel2003Export();
                break;
            case EXCEL_2007:
                LOG.info("文件导出服务:excel2007");
                excelExport=new Excel2007Export();
                break;
        }
        if(null !=excelExport){
            excelExport.exportExcel(skuList);
        }else{
            LOG.info("不支持的文件类型");
        }
    }
}
