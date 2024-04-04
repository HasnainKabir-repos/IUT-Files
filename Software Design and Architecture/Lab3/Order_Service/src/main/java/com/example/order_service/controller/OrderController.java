package com.example.order_service.controller;

import com.example.order_service.Entity.Order;
import com.example.order_service.config.ResponseValueObject;
import com.example.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController{
    @Autowired
    private OrderService orderService;

    @GetMapping("/")
    public String getEmployee(){
        return "Hello";
    }
    @GetMapping("/{id}")
    public ResponseValueObject findOrderById(@PathVariable("id") String orderID){
        return orderService.getUserWithDepartment(orderID);
    }

    @PostMapping("/")
    public Order saveCustomer(@RequestBody Order order){
        return orderService.saveOrder(order);
    }
}
