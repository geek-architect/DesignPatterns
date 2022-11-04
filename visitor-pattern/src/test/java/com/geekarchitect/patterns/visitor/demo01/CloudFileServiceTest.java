package com.geekarchitect.patterns.visitor.demo01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class CloudFileServiceTest extends AbstractCloudFileServiceTest {
    private static final Logger LOG = LoggerFactory.getLogger(CloudFileServiceTest.class);
    private CloudFileService cloudFileService;
    private CloudDir userRootDir;
    @BeforeEach
    void setUp() {
       userRootDir=super.mockCloudDir();
    }
    @AfterEach
    void tearDown() {
    }

    @Test
    void countDir() {
        cloudFileService =new CloudFileService();
        FileInfo fileInfo=new FileInfo();
        cloudFileService.countFile(userRootDir,fileInfo);
        LOG.info("第一版：递归算法");
        LOG.info("文件数量：{}",fileInfo.getTotal());
    }
}