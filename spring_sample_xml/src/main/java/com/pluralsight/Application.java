package com.pluralsight;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {

    public static void main(String[] args) {

//        CustomerService service = new CustomerServiceImpl();

        ApplicationContext applicatonContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerService service = applicatonContext.getBean("customerService", CustomerService.class);

        System.out.println(service.findAll().get(0).getFirstName());

    }
}
