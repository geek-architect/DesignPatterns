package com.geekarchitect.patterns.factorymethod.demo04;

import com.geekarchitect.patterns.factorymethod.demo03.SKU;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 抽象工厂：抽象类
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/15
 */
public abstract class AbstractExcelExportFactory implements IExcelExportFactory {
    private static final Logger LOG = LoggerFactory.getLogger(AbstractExcelExportFactory.class);
    /*
     *Excel文件
     * @author: 极客架构师@吴念
     * @date: 2022/6/18
     * @param:
     * @return:
     */
    protected IExcelFile excelFile = null;

    /**
     * 模板方法模式：个性化方法，同时也是钩子方法
     */
    @Override
    public IFileTitleRow createFileTitleRow() {
        //可以提供一个默认实现,创建文件标题行对象，并添加到excel文件中。。。
        LOG.info("抽象工厂:创建文件标题行对象");
        return null;
    }

    /**
     * 模板方法模式：个性化方法，同时也是钩子方法。
     */
    @Override
    public IExcelFile createExcel() {
        //可以提供一个默认实现,比如创建一个excel2003对应的workbook。
        LOG.info("抽象工厂:创建Excel文件对象，默认为2003版本");
        return new IExcelFile() {
            @Override
            public void addFileTitleRow(IFileTitleRow fileTitleRow) {

            }

            @Override
            public void addTableTitleRow(ITableTitleRow tableTitleRow) {

            }

            @Override
            public void addDataRow(IDataRow dataRow) {

            }

            @Override
            public void addTotalRow(ITotalRow totalRow) {

            }
        };
    }

    /**
     * 模板方法模式：模板方法
     *
     * @param skuList
     */
    @Override
    public final void exportExcel(List<SKU> skuList) {
        LOG.info("抽象工厂-模板方法:导出Excel文件");
        excelFile = createExcel();
        IFileTitleRow fileTitleRow = createFileTitleRow();
        ITableTitleRow tableTitleRow = createTableTitleRow();
        IDataRow dataRow = createDataRow();
        ITotalRow totalRow = createTotalRow();
        excelFile.addFileTitleRow(fileTitleRow);
        excelFile.addTableTitleRow(tableTitleRow);
        excelFile.addDataRow(dataRow);
        excelFile.addTotalRow(totalRow);
    }
}
