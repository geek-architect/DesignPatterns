package com.geekarchitect.patterns.factorymethod.demo04;

import com.geekarchitect.patterns.factorymethod.demo03.AbstractTest;
import com.geekarchitect.patterns.factorymethod.demo03.SKU;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/6/13
 */
public class TestFileExport extends AbstractTest {
    private static final Logger LOG = LoggerFactory.getLogger(TestFileExport.class);

    public static void main(String[] args) {
        TestFileExport testFileExport = new TestFileExport();
        testFileExport.demo01();
    }

    public void demo01() {
        LOG.info("第四版代码：Excel文件导出框架-基于工厂方法模式自产自销形态");
        List<SKU> skuList = generateSku(100);
        IExcelExportFactory excelExportFactory = new Excel2003ExportFactory();
        excelExportFactory.exportExcel(skuList);
        excelExportFactory = new Excel2007ExportFactory();
        excelExportFactory.exportExcel(skuList);
    }
}
