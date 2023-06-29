package com.example.ordersvc.vo;

import lombok.Data;

@Data
public class RequestOrder {
    private String productId;

    private String qty;

    private String unitPrice;
}
