package com.geekarchitect.patterns.visitor.demo02;

import com.geekarchitect.patterns.visitor.demo01.FileInfo;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/3
 */
public class CountCloudFileVisitorV2 implements ICloudFileVisitorV2 {
    @Override
    public void visit(CloudDirV2 cloudDirV2, FileInfo fileInfo) {

    }

    @Override
    public void visit(CloudTxtV2 cloudTxtV2, FileInfo fileInfo) {
        fileInfo.increase();
    }

    @Override
    public void visit(CloudImgV2 cloudImgV2, FileInfo fileInfo) {
        fileInfo.increase();
    }
}
