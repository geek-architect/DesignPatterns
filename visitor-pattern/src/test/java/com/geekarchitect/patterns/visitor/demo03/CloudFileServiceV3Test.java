package com.geekarchitect.patterns.visitor.demo03;

import com.geekarchitect.patterns.visitor.demo01.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class CloudFileServiceV3Test extends AbstractCloudFileServiceTest {

    private static final Logger LOG = LoggerFactory.getLogger(CloudFileServiceV3Test.class);
    private CloudFileServiceV3 cloudFileService;
    private CloudDir userRootDir;

    @BeforeEach
    void setUp() {
        this.userRootDir=super.mockCloudDir();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void countFile() {
        cloudFileService =new CloudFileServiceV3();
        FileInfo fileInfo=new FileInfo();
        ICloudFileVisitorV3 cloudFileVisitorV3=new CountCloudFileVisitorV3();
        cloudFileService.countFile(userRootDir,fileInfo,cloudFileVisitorV3);
        LOG.info("第三版：基于访问者模式（零侵入方式）");
        LOG.info("文件数量：{}",fileInfo.getTotal());
    }
}