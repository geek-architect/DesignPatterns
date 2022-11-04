package com.geekarchitect.patterns.visitor.demo01;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/2
 */
@Data
public class CloudDir implements ICloudFile {
    private String name;
    private String path;
    private CloudDir parent;
    private List<ICloudFile> childList = new ArrayList<>();

    public CloudDir(String name, String path) {
        this.name = name;
        this.path = path;
    }

    @Override
    public boolean isDir() {
        return true;
    }

    @Override
    public CloudFileType getCloudFileType() {
        return CloudFileType.DIR;
    }

    public void addChildFile(ICloudFile ICloudFile) {
        childList.add(ICloudFile);
    }
}
