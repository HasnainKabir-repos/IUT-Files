package com.example.order_service.config;


import com.example.order_service.Entity.Customer;
import com.example.order_service.Entity.Employee;
import com.example.order_service.Entity.Order;
import com.example.order_service.Entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseValueObject{
    private Customer customer;
    private Product product;
    private Employee employee;
    private Order order;
}