package com.geekarchitect.patterns.visitor.demo03;

import com.geekarchitect.patterns.visitor.demo01.FileInfo;
import com.geekarchitect.patterns.visitor.demo01.CloudDir;
import com.geekarchitect.patterns.visitor.demo01.CloudImg;
import com.geekarchitect.patterns.visitor.demo01.CloudTxt;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/11/3
 */
public class CountCloudFileVisitorV3 extends AbstractCloudFileVisitorV3 {
    @Override
    public void visit(CloudDir cloudDir, FileInfo fileInfo) {
    }

    @Override
    public void visit(CloudTxt cloudTxt, FileInfo fileInfo) {
        fileInfo.increase();
    }

    @Override
    public void visit(CloudImg cloudImg, FileInfo fileInfo) {
        fileInfo.increase();
    }
}
