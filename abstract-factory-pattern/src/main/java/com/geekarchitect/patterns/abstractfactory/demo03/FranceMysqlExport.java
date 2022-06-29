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
public class FranceMysqlExport implements ISqlExport {
    private static final Logger LOG = LoggerFactory.getLogger(FranceMysqlExport.class);

    public void exportSql(List<SKU> skuList) {
        LOG.info("导出法国-mysql文件");
    }
}
