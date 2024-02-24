package com.example.customer_service.service;

import com.example.customer_service.entity.Customer;
import com.example.customer_service.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer findCustomerById(String customerId){
        return customerRepository.findCustomerById((customerId));
    }
}
