package com.geekarchitect.patterns.bridge.demo03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileExportServiceTest extends AbstractTest {

    private static final Logger LOG = LoggerFactory.getLogger(FileExportServiceTest.class);

    private FileExportService fileExportService;
    @BeforeEach
    void setUp() {
        fileExportService=new FileExportService();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void exportFile() {
        LOG.info("基于桥接模式的文件导出模式");
        List<SKU> skuList=generateSku(6);
        fileExportService.exportFile(skuList);
    }
}