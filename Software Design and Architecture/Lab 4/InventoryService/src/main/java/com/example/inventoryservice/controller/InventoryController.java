package com.example.inventoryservice.controller;

import com.example.inventoryservice.Constants;
import com.example.inventoryservice.entity.Product;
import com.example.orderservice.entity.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class InventoryController {
    private List<Product> products = new ArrayList<>(Arrays.asList(
            new Product("123", "Fried Rice", 10),
            new Product("124", "Chicken Fry", 10)
    ));

    @RabbitListener(queues = Constants.QUEUE )
    public void consumeMessageFromQueue(OrderStatus orderStatus) {

        System.out.println("Message Received from queue: " +orderStatus );

        for(Product product: products){
            if(product.getId().equals(orderStatus.getProductId())){
                if(product.getQuantity()>orderStatus.getOrder().getQty()){
                    product.setQuantity(product.getQuantity() - orderStatus.getOrder().getQty());
                    System.out.println(orderStatus.getMessage());
                    System.out.println(product.getQuantity());
                }else{
                    System.out.println("Product is all sold out");
                }
            }

        }
    }
}
