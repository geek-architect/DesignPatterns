package com.geekarchitect.patterns.visitor.demo02;

import com.geekarchitect.patterns.visitor.demo01.FileInfo;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/2
 */
public class CloudFileServiceV2 {
    public void countFile(ICloudFileV2 cloudFileV2, FileInfo fileInfo, ICloudFileVisitorV2 cloudFileVisitor) {
        if (!cloudFileV2.isDir()) {
            throw new IllegalArgumentException();
        }
        List<ICloudFileV2> childList = ((CloudDirV2) cloudFileV2).getChildList();
        childList.forEach(file -> {
            file.accept(cloudFileVisitor, fileInfo);
            if (file.isDir()) {
                countFile(file, fileInfo, cloudFileVisitor);
            }
        });
    }
}
