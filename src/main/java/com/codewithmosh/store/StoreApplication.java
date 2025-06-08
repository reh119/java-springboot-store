package com.codewithmosh.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
       ApplicationContext context =  SpringApplication.run(StoreApplication.class, args); // returns object of type application context(ioc container aka storage for objects)
        // goal here is to get spring to manage object of OrderService
       var orderService =  context.getBean(OrderService.class); // bean is object managed by spring
        orderService.placeOrder();



    }

}
