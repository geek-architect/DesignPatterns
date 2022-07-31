package com.geekarchitect.patterns.prototype.demo02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/7/19
 */
public class TestPrototype {
    private static final Logger LOG = LoggerFactory.getLogger(TestPrototype.class);

    public static void main(String[] args) {
        TestPrototype testPrototype = new TestPrototype();
        testPrototype.demo02();
    }

    public void demo01() {
        SKU011 sku1 = new SKU011("01", "sku1", 100);
        SKU011 sku2 = null;
        try {
            sku2 = (SKU011) sku1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        LOG.info("第一版代码:基于Object的clone方法(浅复制）");
        LOG.info("before ");
        LOG.info("sku1={}", sku1);
        LOG.info("sku2={}", sku2);

        sku1.setId("01新");
        sku1.setName("sku011新");
        sku1.setQuantity(200);

        LOG.info("after ");
        LOG.info("sku1={}", sku1);
        LOG.info("sku2={}", sku2);
    }

    public void demo02() {
        List<String> imageList = new ArrayList<>();
        imageList.add("图片1");
        imageList.add("图片2");
        imageList.add("图片3");
        SKU02 sku1 = new SKU02("021", "sku1", 100, imageList);
        SKU02 sku2 = null;
        try {
            sku2 = (SKU02) sku1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        LOG.info("第二版代码 复制带有多张图片的商品（方案失败）");
        LOG.info("before ");
        LOG.info("sku1={}", sku1);
        LOG.info("sku2={}", sku2);

        sku1.setId("021新");
        sku1.setName("sku1新");
        sku1.setQuantity(200);
        sku1.getImageList().add("图片4");


        LOG.info("after ");
        LOG.info("sku1={}", sku1);
        LOG.info("sku2={}", sku2);
    }

    public void demo03() {
        List<String> imageList = new ArrayList<>();
        imageList.add("图片1");
        imageList.add("图片2");
        imageList.add("图片3");
        SKU021 sku1 = new SKU021("021", "sku1", 100, imageList);
        SKU021 sku2 = null;
        try {
            sku2 = (SKU021) sku1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        LOG.info("第三版代码:复制带有多张图片的商品（深度复制）");
        LOG.info("before ");
        LOG.info("sku1={}", sku1);
        LOG.info("sku2={}", sku2);

        sku1.setId("021新");
        sku1.setName("sku1新");
        sku1.setQuantity(200);
        imageList.add("图片4");

        LOG.info("after ");
        LOG.info("sku1={}", sku1);
        LOG.info("sku2={}", sku2);
    }

    public void demo04() {
        List<String> imageList = new ArrayList<>();
        imageList.add("图片1");
        imageList.add("图片2");
        imageList.add("图片3");
        SKU022 sku1 = new SKU022("021", "sku1", 100, imageList);
        SKU022 sku2 = new SKU022(sku1);
        LOG.info("第四版代码:基于copy constructor方法（深度复制，推荐方案）");
        LOG.info("before ");
        LOG.info("sku1={}", sku1);
        LOG.info("sku2={}", sku2);

        sku1.setId("021新");
        sku1.setName("sku1新");
        sku1.setQuantity(200);
        imageList.add("图片4");

        LOG.info("after ");
        LOG.info("sku1={}", sku1);
        LOG.info("sku2={}", sku2);
    }

    public void demo05() {
        List<String> imageList = new ArrayList<>();
        imageList.add("图片1");
        imageList.add("图片2");
        imageList.add("图片3");
        SKU031 sku1 = new SKU031("021", "sku1", 100, imageList);
        SKU031 sku2 = null;
        try {
            sku2 = (SKU031) sku1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        LOG.info("第五版代码:方案1 apache commons工具类（对象必须支持序列化）");
        LOG.info("before ");
        LOG.info("sku1={}", sku1);
        LOG.info("sku2={}", sku2);

        sku1.setId("021新");
        sku1.setName("sku1新");
        sku1.setQuantity(200);
        imageList.add("图片4");

        LOG.info("after ");
        LOG.info("sku1={}", sku1);
        LOG.info("sku2={}", sku2);
    }

    public void demo06() {
        List<String> imageList = new ArrayList<>();
        imageList.add("图片1");
        imageList.add("图片2");
        imageList.add("图片3");
        SKU032 sku1 = new SKU032("021", "sku1", 100, imageList);
        SKU032 sku2 = null;
        try {
            sku2 = (SKU032) sku1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        LOG.info("第五版代码:方案2 spring工具类");
        LOG.info("before ");
        LOG.info("sku1={}", sku1);
        LOG.info("sku2={}", sku2);

        sku1.setId("021新");
        sku1.setName("sku1新");
        sku1.setQuantity(200);
        imageList.add("图片4");

        LOG.info("after ");
        LOG.info("sku1={}", sku1);
        LOG.info("sku2={}", sku2);
    }
}
