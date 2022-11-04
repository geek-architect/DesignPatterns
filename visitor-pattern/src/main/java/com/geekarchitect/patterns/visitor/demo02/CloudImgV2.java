package com.geekarchitect.patterns.visitor.demo02;

import com.geekarchitect.patterns.visitor.demo01.CloudFileType;
import com.geekarchitect.patterns.visitor.demo01.FileInfo;
import lombok.Data;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/2
 */
@Data
public class CloudImgV2 implements ICloudFileV2 {
    private String name;
    private String path;
    private CloudDirV2 parent;

    public CloudImgV2(String name, String path) {
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

    @Override
    public void accept(ICloudFileVisitorV2 cloudFileVisitor, FileInfo fileInfo) {
        cloudFileVisitor.visit(this, fileInfo);
    }
}
