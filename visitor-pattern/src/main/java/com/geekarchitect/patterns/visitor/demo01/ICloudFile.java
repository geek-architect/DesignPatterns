package com.geekarchitect.patterns.visitor.demo01;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/2
 */
public interface ICloudFile {
    String getName();

    String getPath();

    ICloudFile getParent();

    CloudFileType getCloudFileType();

    boolean isDir();
}
