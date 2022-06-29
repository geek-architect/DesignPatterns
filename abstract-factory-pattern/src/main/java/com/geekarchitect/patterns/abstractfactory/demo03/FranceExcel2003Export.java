package com.geekarchitect.patterns.abstractfactory.demo03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 具体产品
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/13
 */
public class FranceExcel2003Export implements IExcelExport {
    private static final Logger LOG = LoggerFactory.getLogger(FranceExcel2003Export.class);

    public void exportExcel(List<SKU> skuList) {
        LOG.info("导出法国-excel2003文件");
    }
}
