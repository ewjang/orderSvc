package com.example.ordersvc.service;


import com.example.ordersvc.dto.OrderDto;
import com.example.ordersvc.jpa.OrderEntity;

public interface OrderService {

    OrderDto createOrder (OrderDto orderDetails);

    Iterable<OrderEntity> getOrdersByUserId(String userId);

    OrderDto getOrderByOrderId(String orderId);
}
