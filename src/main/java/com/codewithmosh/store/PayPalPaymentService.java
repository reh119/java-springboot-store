package com.codewithmosh.store;

public class PayPalPaymentService implements PaymentService {
    public void processPayment(double amount) {
        System.out.println("Paypaal");
        System.out.println("Amount: " + amount );
    }
}
