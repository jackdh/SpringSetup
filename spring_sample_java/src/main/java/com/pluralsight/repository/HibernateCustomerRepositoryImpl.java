package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUsername}")
    private String dbUsername;

    @Override
    public List<Customer> findAll() {
        System.out.println(dbUsername);
        List<Customer> customerList = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Jack");
        customer.setLastName("Hamilton");
        customerList.add(customer);
        return customerList;
    }
}
