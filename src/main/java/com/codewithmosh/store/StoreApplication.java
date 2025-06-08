package com.codewithmosh.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
       // SpringApplication.run(StoreApplication.class, args);
        var orderService = new OrderService(new PayPalPaymentService()); // here is where we are injecting the type of payment service we want to use right now. we can pass in new payment services late
        orderService.placeOrder();
    }

}
