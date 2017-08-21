package com.pluralsight.service;


import com.pluralsight.model.Customer;
import com.pluralsight.repositiory.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    //    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("Using constructor injection");
        this.customerRepository = customerRepository;

    }

//    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("We are using Setter Injection.");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
