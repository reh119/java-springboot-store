package com.codewithmosh.store;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
// tell spring to manage object of type OrderService (bean), is a service class so also can use @Service. can use either
public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }
    public void placeOrder(){
        paymentService.processPayment(10);
    }

}
