package com.pluralsight.service;


import com.pluralsight.model.Customer;
import com.pluralsight.repositiory.CustomerRepository;
import com.pluralsight.repositiory.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
