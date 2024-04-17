package com.matias.tite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.matias.tite.factory.shapes.PaymentMethodFactory;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void visaPaymentTenDollars() {
        double result = PaymentMethodFactory.createPaymentMethod("visa", 10.0);
        System.out.println(result);
        assertEquals(10.5, result, 0.0);
    }

    @Test
    public void mastercardPaymentTenDollars() {
        double result = PaymentMethodFactory.createPaymentMethod("mastercard", 10.0);
        System.out.println(result);
        assertEquals(10.4, result, 0.0);
    }

    @Test
    public void paypalPaymentTenDollars() {
        double result = PaymentMethodFactory.createPaymentMethod("paypal", 10.0);
        System.out.println(result);
        assertEquals(10.6, result, 0.0);
    }

    @Test
    public void cashPaymentTenDollars() {
        double result = PaymentMethodFactory.createPaymentMethod("efectivo", 10.0);
        System.out.println(result);
        assertEquals(9.0, result, 0.0);
    }
}
