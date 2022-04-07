package com.example.mysharding.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author 罗集强
 * @Date 2022/4/6 16:00
 */
@Data
public class Order {
    private Long orderId;

    private BigDecimal price;

    private Long userId;

    private String status;
}
