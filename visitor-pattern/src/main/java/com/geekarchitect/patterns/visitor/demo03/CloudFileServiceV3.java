package com.geekarchitect.patterns.visitor.demo03;

import com.geekarchitect.patterns.visitor.demo01.FileInfo;
import com.geekarchitect.patterns.visitor.demo01.CloudDir;
import com.geekarchitect.patterns.visitor.demo01.ICloudFile;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/2
 */
public class CloudFileServiceV3 {
    public void countFile(ICloudFile cloudFile, FileInfo fileInfo, ICloudFileVisitorV3 cloudFileVisitor) {
        if (!cloudFile.isDir()) {
            throw new IllegalArgumentException();
        }
        List<ICloudFile> childList = ((CloudDir) cloudFile).getChildList();
        childList.forEach(file -> {
            cloudFileVisitor.visit(file, fileInfo);
            if (file.isDir()) {
                countFile(file, fileInfo, cloudFileVisitor);
            }
        });
    }
}
