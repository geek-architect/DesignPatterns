package com.geekarchitect.patterns.factorymethod.demo03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/6/15
 */
public class Excel2003ExportFactory extends AbstractExcelExportFactory {
    private static final Logger LOG = LoggerFactory.getLogger(Excel2003ExportFactory.class);

    @Override
    public IExcelExport createExcelExport() {
        LOG.info("具体工厂：创建Excel2003Export对象");
        return new Excel2003Export();
    }
}
