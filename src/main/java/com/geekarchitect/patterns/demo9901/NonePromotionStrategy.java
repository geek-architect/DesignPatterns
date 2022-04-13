package com.geekarchitect.patterns.demo9901;

import com.geekarchitect.patterns.demo0101.CartItem;
import com.geekarchitect.patterns.demo0101.Member;
import com.geekarchitect.patterns.demo0101.SKU;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * 促销策略：无促销策略
 *
 * @author 极客架构师@吴念
 * @createTime 2022/3/26
 */
public class NonePromotionStrategy extends AbstractPromotionStrategy  {
    private static final Logger LOG = LoggerFactory.getLogger(NonePromotionStrategy.class);
}
