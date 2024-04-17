package com.matias.tite.factory.shapes;

import java.util.HashMap;
import java.util.Map;

public class PaymentMethodFactory {
    private static final Map<String, PaymentMethod> paymentMethods = new HashMap<>();

    static {
        paymentMethods.put("visa", new Visa());
        paymentMethods.put("mastercard", new Mastercard());
        paymentMethods.put("paypal", new Paypal());
        paymentMethods.put("efectivo", new Cash());
    }

    public static double createPaymentMethod(String type, double amount) {
        type = type.toLowerCase();

        return paymentMethods.get(type).totalToPay(amount);
    }
}
