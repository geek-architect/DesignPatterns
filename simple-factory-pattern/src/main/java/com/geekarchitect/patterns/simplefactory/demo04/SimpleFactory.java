package com.geekarchitect.patterns.simplefactory.demo04;

import com.geekarchitect.patterns.simplefactory.demo03.Excel2003Export;
import com.geekarchitect.patterns.simplefactory.demo03.Excel2007Export;
import com.geekarchitect.patterns.simplefactory.demo03.FileType;
import com.geekarchitect.patterns.simplefactory.demo03.IExcelExport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/6/13
 */
public class SimpleFactory {
    private static final Logger LOG = LoggerFactory.getLogger(SimpleFactory.class);
    public static IExcelExport createExcelExport(FileType fileType){
        LOG.info("简单工厂");
        IExcelExport excelExport=null;
        switch (fileType){
            case EXCEL_2003:
                excelExport=new Excel2003Export();
                break;
            case EXCEL_2007:
                excelExport=new Excel2007Export();
        }
        return excelExport;
    }
}
