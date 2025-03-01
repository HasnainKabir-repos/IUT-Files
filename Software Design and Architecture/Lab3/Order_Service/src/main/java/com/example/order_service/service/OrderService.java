package com.example.order_service.service;

import com.example.order_service.Entity.Customer;
import com.example.order_service.Entity.Employee;
import com.example.order_service.Entity.Order;
import com.example.order_service.Entity.Product;
import com.example.order_service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.order_service.config.ResponseValueObject;
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RestTemplate restTemplate;

    public ResponseValueObject getUserWithDepartment(String orderId) {
        try{
            ResponseValueObject responseValueObject= new ResponseValueObject();
            Order order = orderRepository.findOrderById(orderId);
            responseValueObject.setOrder(order);
            Product product = restTemplate.getForObject("http://PRODUCT-SERVICE/products/" + order.getProductId(), Product.class);
            responseValueObject.setProduct(product);
            Customer customer = restTemplate.getForObject("http://CUSTOMER-SERVICE/customers/" + order.getCustomerId(), Customer.class);
            responseValueObject.setCustomer(customer);
            Employee employee = restTemplate.getForObject("http://EMPLOYEE-SERVICE/employees/" + order.getEmployeeId(), Employee.class);
            responseValueObject.setEmployee(employee);
            System.out.println(responseValueObject);
            return responseValueObject;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public Order saveOrder(Order order){
        orderRepository.save(order);
        return order;
    }
}
