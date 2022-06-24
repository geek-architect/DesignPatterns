package com.geekarchitect.patterns.factorymethod.demo03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/6/15
 */
public class Excel2007ExportFactory extends AbstractExcelExportFactory {
    private static final Logger LOG = LoggerFactory.getLogger(Excel2007ExportFactory.class);

    @Override
    public IExcelExport createExcelExport() {
        LOG.info("具体工厂：创建Excel2007Export对象");
        return new Excel2007Export();
    }
}
