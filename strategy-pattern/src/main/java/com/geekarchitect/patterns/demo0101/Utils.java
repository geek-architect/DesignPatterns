package com.geekarchitect.patterns.demo0101;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/4/2
 */
public class Utils {
    /**
     * 生成一个随机数X， 0<=X<max
     *
     * @param max
     * @return
     */
    public static BigDecimal random(BigDecimal max) {
        BigDecimal x = new BigDecimal(new Random().nextDouble() * (max.doubleValue()));
        return x.setScale(2, BigDecimal.ROUND_DOWN);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(random(new BigDecimal(100)));
        }

    }
}
