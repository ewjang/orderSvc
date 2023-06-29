package com.example.ordersvc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseOrder {

    private String productId;

    private String orderId;

    private String qty;

    private Integer unitPrice;

    private Integer totalPrice;

    private Date CreatedAt;
}
