package com.geekarchitect.patterns.abstractfactory.demo02;

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
        LOG.info("第五版代码：基于抽象工厂模式");
        List<SKU> skuList = generateSku(100);
        FileExportService fileExportService = new FileExportService();
        fileExportService.exportFile(skuList);

    }
}
