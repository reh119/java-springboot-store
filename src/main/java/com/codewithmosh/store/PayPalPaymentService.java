package com.codewithmosh.store;

import org.springframework.stereotype.Service;

@Service
public class PayPalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Passypaal");
        System.out.println("Amount: " + amount );
    }
}
