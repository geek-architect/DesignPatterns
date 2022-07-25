package com.geekarchitect.patterns.prototype.demo03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;


/**
 * @author 极客架构师@吴念
 * @createTime 2022/7/19
 */
public class TestPrototype {
    private static final Logger LOG = LoggerFactory.getLogger(TestPrototype.class);

    public static void main(String[] args) {
        TestPrototype testPrototype = new TestPrototype();
        testPrototype.demo03();
    }

    public void demo01() {
        SKU01 sku1 = new SKU01("01", "sku1", 100);
        SKU01 sku2 = null;
        try {
            sku2 = (SKU01) sku1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        LOG.info("案例1:Object clone方法不受transient修饰符影响");
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
        SKU02 sku1 = new SKU02("01", "sku1", 100);
        SKU02 sku2 = null;
        try {
            sku2 = (SKU02) sku1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        LOG.info("案例2：序列化方法受transient修饰符影响");
        LOG.info("before ");
        LOG.info("sku1={}", sku1);
        LOG.info("sku2={}", sku2);
    }

    public void demo03() {
        SKU01 sku1 = new SKU01("01", "sku1", 100);
        SKU01 sku2 = new SKU01("02", "sku2", 200);

        ArrayList<SKU01> arrayList01 = new ArrayList<>();
        arrayList01.add(sku1);
        arrayList01.add(sku2);

        LOG.info("ArrayList clone，本质是灰复制");
        ArrayList<SKU01> arrayList02 = (ArrayList<SKU01>) arrayList01.clone();
        LOG.info("before");
        LOG.info("arrayList01 = {}", arrayList01);
        LOG.info("arrayList02 = {}", arrayList02);


        SKU01 sku3 = new SKU01("03", "sku3", 300);
        arrayList01.add(sku3);
        LOG.info("第一次修改，具有深复制的假象");
        LOG.info("arrayList01 = {}", arrayList01);
        LOG.info("arrayList02 = {}", arrayList02);

        sku1.setId("新01");
        LOG.info("第二次修改，证明不是深复制");
        LOG.info("arrayList01 = {}", arrayList01);
        LOG.info("arrayList02 = {}", arrayList02);
    }


}
