package com.matias.tite;

import com.matias.tite.factory.shapes.PaymentMethodFactory;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println(PaymentMethodFactory.createPaymentMethod("visa", 10));
        System.out.println(PaymentMethodFactory.createPaymentMethod("mastercard", 10));
        System.out.println(PaymentMethodFactory.createPaymentMethod("paypal", 10));
        System.out.println(PaymentMethodFactory.createPaymentMethod("efectivo", 10));
    }
}
