package com.geekarchitect.patterns.bridge.demo03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 具体工厂
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/21
 */
public class RussiaFileExport extends AbstractFileExport {
    private static final Logger LOG = LoggerFactory.getLogger(RussiaFileExport.class);

    public RussiaFileExport(IExcelExport excelExport) {
        super(excelExport);
    }

    public RussiaFileExport(ISqlExport sqlExport) {
        super(sqlExport);
    }

    public RussiaFileExport() {
    }

    @Override
    public void exportExcel(List<SKU> skuList) {
        //对skuList进行俄文化处理
        super.exportExcel(skuList);
    }

    @Override
    public void exportSql(List<SKU> skuList) {
        //对skuList进行俄文化处理
        super.exportSql(skuList);
    }
}
