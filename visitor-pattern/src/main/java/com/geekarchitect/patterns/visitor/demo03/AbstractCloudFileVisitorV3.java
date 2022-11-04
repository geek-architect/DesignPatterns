package com.geekarchitect.patterns.visitor.demo03;

import com.geekarchitect.patterns.visitor.demo01.*;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/3
 */
public abstract class AbstractCloudFileVisitorV3 implements ICloudFileVisitorV3 {
    @Override
    public final void visit(ICloudFile cloudFile, FileInfo fileInfo) {
        switch (cloudFile.getCloudFileType()) {
            case DIR:
                visit((CloudDir) cloudFile, fileInfo);
                break;
            case TXT:
                visit((CloudTxt) cloudFile, fileInfo);
                break;
            case IMG:
                visit((CloudImg) cloudFile, fileInfo);
                break;
        }
    }

    protected abstract void visit(CloudDir cloudDir, FileInfo fileInfo);

    protected abstract void visit(CloudTxt cloudTxt, FileInfo fileInfo);

    protected abstract void visit(CloudImg cloudImg, FileInfo fileInfo);
}
