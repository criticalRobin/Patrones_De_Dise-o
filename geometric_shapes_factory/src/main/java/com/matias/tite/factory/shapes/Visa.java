package com.matias.tite.factory.shapes;

public class Visa implements PaymentMethod {
    @Override
    public double totalToPay(double amount) {
        return amount + (amount * 0.05);
    }
}
