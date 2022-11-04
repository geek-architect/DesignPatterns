package com.geekarchitect.patterns.visitor.demo02;

import com.geekarchitect.patterns.visitor.demo01.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class CloudFileServiceV2Test extends AbstractCloudFileServiceTest {
    private static final Logger LOG = LoggerFactory.getLogger(CloudFileServiceV2Test.class);

    private CloudFileServiceV2 cloudFileService;
    private CloudDirV2 userRootDir;

    @BeforeEach
    void setUp() {
        this.userRootDir=super.mockCloudDirV2();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void countFile() {
        cloudFileService =new CloudFileServiceV2();
        FileInfo fileInfo=new FileInfo();
        ICloudFileVisitorV2 cloudFileVisitor=new CountCloudFileVisitorV2();
        cloudFileService.countFile(userRootDir,fileInfo,cloudFileVisitor);
        LOG.info("第二版：基于访问者模式（传统方式）");
        LOG.info("文件数量：{}",fileInfo.getTotal());
    }
}