package com.geekarchitect.patterns.adapter.demo02;

import lombok.Data;

import java.util.Date;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/3/16
 */
@Data
public class PayInfo {
    private Long memberID;
    private Double price;
    private Long orderID;
    private Date payDate;
}
