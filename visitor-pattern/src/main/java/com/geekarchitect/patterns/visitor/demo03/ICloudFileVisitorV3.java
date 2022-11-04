package com.geekarchitect.patterns.visitor.demo03;

import com.geekarchitect.patterns.visitor.demo01.FileInfo;
import com.geekarchitect.patterns.visitor.demo01.ICloudFile;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/3
 */
public interface ICloudFileVisitorV3 {
    void visit(ICloudFile cloudFile, FileInfo fileInfo);
}
