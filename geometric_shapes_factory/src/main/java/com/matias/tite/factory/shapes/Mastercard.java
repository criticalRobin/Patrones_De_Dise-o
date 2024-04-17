package com.matias.tite.factory.shapes;

public class Mastercard implements PaymentMethod {
    @Override
    public double totalToPay(double amount) {
        return amount + (amount * 0.04);
    }
}
