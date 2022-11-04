package com.geekarchitect.patterns.visitor.demo01;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/2
 */
public class CloudFileService {
    public void countFile(ICloudFile ICloudFile, FileInfo fileInfo) {
        if (!ICloudFile.isDir()) {
            throw new IllegalArgumentException();
        }
        List<ICloudFile> childList = ((CloudDir) ICloudFile).getChildList();
        childList.forEach(file -> {
            if (file.isDir()) {
                countFile(file, fileInfo);
            } else {
                fileInfo.increase();
            }
        });
    }
}
