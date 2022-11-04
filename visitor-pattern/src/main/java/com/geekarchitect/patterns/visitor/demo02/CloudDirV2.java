package com.geekarchitect.patterns.visitor.demo02;

import com.geekarchitect.patterns.visitor.demo01.CloudFileType;
import com.geekarchitect.patterns.visitor.demo01.FileInfo;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/2
 */
@Data
public class CloudDirV2 implements ICloudFileV2 {
    private String name;
    private String path;
    private CloudDirV2 parent;
    private List<ICloudFileV2> childList = new ArrayList<>();

    public CloudDirV2(String name, String path) {
        this.name = name;
        this.path = path;
    }

    @Override
    public boolean isDir() {
        return true;
    }

    @Override
    public void accept(ICloudFileVisitorV2 cloudFileVisitor, FileInfo fileInfo) {
        cloudFileVisitor.visit(this, fileInfo);
    }

    @Override
    public CloudFileType getCloudFileType() {
        return CloudFileType.DIR;
    }

    public void addChildFile(ICloudFileV2 ICloudFile) {
        childList.add(ICloudFile);
    }

}
