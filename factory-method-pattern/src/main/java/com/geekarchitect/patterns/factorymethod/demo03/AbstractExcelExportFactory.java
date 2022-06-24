package com.geekarchitect.patterns.factorymethod.demo03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/6/15
 */
public abstract class AbstractExcelExportFactory implements IExcelExportFactory {
    private static final Logger LOG = LoggerFactory.getLogger(Excel2003Export.class);

    @Override
    public IExcelExport createExcelExport() {
        LOG.info("抽象工厂类，提供一个默认操作");
        return null;
    }
}
