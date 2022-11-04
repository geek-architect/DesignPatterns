package com.geekarchitect.patterns.visitor.demo01;

import com.geekarchitect.patterns.visitor.demo02.CloudDirV2;
import com.geekarchitect.patterns.visitor.demo02.CloudImgV2;
import com.geekarchitect.patterns.visitor.demo02.CloudTxtV2;

public abstract class AbstractCloudFileServiceTest {

    protected CloudDir mockCloudDir() {
        CloudDir userRootDir = new CloudDir("root", "/");
        CloudDir userTxtDir1 = new CloudDir("文本文件夹", "");
        CloudDir userTxtDir11 = new CloudDir("文本文件夹11", "");
        CloudDir userImgDir = new CloudDir("图库", "");

        CloudTxt txtFile01 = new CloudTxt("文本文件01", "");
        CloudTxt txtFile02 = new CloudTxt("文本文件02", "");
        CloudTxt txtFile03 = new CloudTxt("文本文件03", "");
        CloudTxt txtFile111 = new CloudTxt("文本文件111", "");
        CloudTxt txtFile112 = new CloudTxt("文本文件112", "");
        CloudImg imgFile01 = new CloudImg("照片01", "");
        CloudImg imgFile02 = new CloudImg("照片02", "");

        userRootDir.addChildFile(userTxtDir1);
        userRootDir.addChildFile(userImgDir);
        userTxtDir1.addChildFile(userTxtDir11);
        userTxtDir1.addChildFile(txtFile01);
        userTxtDir1.addChildFile(txtFile02);
        userTxtDir1.addChildFile(txtFile03);
        userTxtDir11.addChildFile(txtFile111);
        userTxtDir11.addChildFile(txtFile112);
        userImgDir.addChildFile(imgFile01);
        userImgDir.addChildFile(imgFile02);
        return userRootDir;
    }
    protected CloudDirV2 mockCloudDirV2() {
        CloudDirV2 userRootDir = new CloudDirV2("root", "/");
        CloudDirV2 userTxtDir1 = new CloudDirV2("文本文件夹1", "");
        CloudDirV2 userTxtDir11 = new CloudDirV2("文本文件夹11", "");
        CloudDirV2 userImgDir = new CloudDirV2("图库", "");
        CloudTxtV2 txtFile01 = new CloudTxtV2("文本文件01", "");
        CloudTxtV2 txtFile02 = new CloudTxtV2("文本文件02", "");
        CloudTxtV2 txtFile03 = new CloudTxtV2("文本文件03", "");
        CloudTxtV2 txtFile111 = new CloudTxtV2("文本文件111", "");
        CloudTxtV2 txtFile112 = new CloudTxtV2("文本文件112", "");
        CloudImgV2 imgFile01 = new CloudImgV2("照片01", "");
        CloudImgV2 imgFile02 = new CloudImgV2("照片02", "");
        userRootDir.addChildFile(userTxtDir1);
        userRootDir.addChildFile(userImgDir);
        userRootDir.addChildFile(userTxtDir11);
        userTxtDir1.addChildFile(txtFile01);
        userTxtDir1.addChildFile(txtFile02);
        userTxtDir1.addChildFile(txtFile03);
        userImgDir.addChildFile(imgFile01);
        userImgDir.addChildFile(imgFile02);
        userTxtDir11.addChildFile(txtFile111);
        userTxtDir11.addChildFile(txtFile112);
        return userRootDir;
    }

}