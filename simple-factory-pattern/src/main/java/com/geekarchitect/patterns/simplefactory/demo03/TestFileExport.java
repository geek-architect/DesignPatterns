package com.geekarchitect.patterns.simplefactory.demo03;

import com.geekarchitect.patterns.simplefactory.demo04.FileExportServiceV2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/6/13
 */
public class TestFileExport extends AbstractTest{
    private static final Logger LOG = LoggerFactory.getLogger(TestFileExport.class);
    public static void main(String[] args) {
        TestFileExport testFileExport=new TestFileExport();
        testFileExport.demo02();
    }
    public void demo01(){
        LOG.info("第一版代码：未使用设计模式");
        List<SKU> skuList=generateSku(100);
        FileExportService fileExportService=new FileExportService();
        fileExportService.exportFile(skuList,FileType.EXCEL_2003);
        fileExportService.exportFile(skuList,FileType.EXCEL_2007);
    }
    public void demo02(){
        LOG.info("第二版代码：基于简单工厂模式");
        List<SKU> skuList=generateSku(100);
        FileExportServiceV2 fileExportService=new FileExportServiceV2();
        fileExportService.exportFile(skuList,FileType.EXCEL_2003);
        fileExportService.exportFile(skuList,FileType.EXCEL_2007);
    }
}
