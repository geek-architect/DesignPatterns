package com.geekarchitect.patterns.bridge.demo03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 具体产品
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/13
 */
public class MysqlExport implements ISqlExport {
    private static final Logger LOG = LoggerFactory.getLogger(MysqlExport.class);

    public void exportSql(List<SKU> skuList) {
        LOG.info("导出mysql文件");
    }
}
