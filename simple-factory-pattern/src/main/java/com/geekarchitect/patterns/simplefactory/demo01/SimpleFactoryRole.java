package com.geekarchitect.patterns.simplefactory.demo01;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/6/13
 */
public class SimpleFactoryRole {
    public static IProductRole createProduct(ProductType productType){
        IProductRole productRole=null;
        switch (productType){
            case PRODUCT_A:
                productRole=new ProductA();
                break;
            case PRODUCT_B:
                productRole=new ProductB();
        }
        return productRole;
    }
}
