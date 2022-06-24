package com.geekarchitect.patterns.factorymethod.demo04;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体工厂：
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/15
 */
public class Excel2003ExportFactory extends AbstractExcelExportFactory {
    private static final Logger LOG = LoggerFactory.getLogger(Excel2003ExportFactory.class);

    @Override
    public ITableTitleRow createTableTitleRow() {
        LOG.info("具体工厂：创建表头对象");
        return null;
    }

    @Override
    public IDataRow createDataRow() {
        LOG.info("具体工厂:创建数据对象");
        return null;
    }

    @Override
    public ITotalRow createTotalRow() {
        LOG.info("具体工厂:创建汇总行对象");
        return null;
    }
}
