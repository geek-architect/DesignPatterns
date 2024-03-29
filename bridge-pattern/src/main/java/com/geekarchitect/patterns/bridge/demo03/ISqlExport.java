package com.geekarchitect.patterns.bridge.demo03;

import java.util.List;

/**
 * 单维度角色：接口
 *
 * @author 极客架构师@吴念
 * @createTime 2022/6/13
 */
public interface ISqlExport {
    void exportSql(List<SKU> skuList);
}
