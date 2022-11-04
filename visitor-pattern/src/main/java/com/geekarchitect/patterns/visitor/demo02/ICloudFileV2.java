package com.geekarchitect.patterns.visitor.demo02;

import com.geekarchitect.patterns.visitor.demo01.CloudFileType;
import com.geekarchitect.patterns.visitor.demo01.FileInfo;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/2
 */
public interface ICloudFileV2 {
    String getName();

    String getPath();

    ICloudFileV2 getParent();

    CloudFileType getCloudFileType();

    boolean isDir();

    void accept(ICloudFileVisitorV2 cloudFileVisitor, FileInfo fileInfo);
}
