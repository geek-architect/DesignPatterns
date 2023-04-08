package com.geekarchitect.patterns.bridge.demo03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 单维度角色：具体类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/13
 */
public class Excel2007Export implements IExcelExport {
    private static final Logger LOG = LoggerFactory.getLogger(Excel2007Export.class);
    public void exportExcel(List<SKU> skuList) {
        LOG.info("导出Excel2007文件");
    }
}
