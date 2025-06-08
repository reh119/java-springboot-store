package com.codewithmosh.store;
// no logic here, just method declaration. like a chef that cooks, but how they cook we dont know as its dependent on implementation
public interface PaymentService {
    void processPayment(double amount);
}
// implementing this interface forces us to write the logic out for all its methods for any class implementing this interface.