package com.pluralsight.repositiory;

import com.pluralsight.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Jack");
        customer.setLastName("Hamilton");
        customerList.add(customer);
        return customerList;
    }
}
