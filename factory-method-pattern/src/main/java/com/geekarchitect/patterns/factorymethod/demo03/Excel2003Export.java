package com.geekarchitect.patterns.factorymethod.demo03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/6/13
 */
public class Excel2003Export implements IExcelExport {
    private static final Logger LOG = LoggerFactory.getLogger(Excel2003Export.class);

    @Override
    public void exportExcel(List<SKU> skuList) {
        LOG.info("具体产品：导出excel2003");
    }
}
