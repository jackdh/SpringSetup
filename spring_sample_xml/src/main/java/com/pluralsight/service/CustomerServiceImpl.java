package com.pluralsight.service;


import com.pluralsight.model.Customer;
import com.pluralsight.repositiory.CustomerRepository;
import com.pluralsight.repositiory.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public  CustomerServiceImpl() {}

    public CustomerServiceImpl(CustomerRepository CustomerRepository) {
        this.customerRepository = CustomerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
