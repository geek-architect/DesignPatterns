package com.geekarchitect.patterns.visitor.demo01;

import lombok.Data;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/2
 */
@Data
public class CloudImg implements ICloudFile {
    private String name;
    private String path;
    private CloudDir parent;

    public CloudImg(String name, String path) {
        this.name = name;
        this.path = path;
    }

    @Override
    public CloudFileType getCloudFileType() {
        return CloudFileType.IMG;
    }

    @Override
    public boolean isDir() {
        return false;
    }
}
