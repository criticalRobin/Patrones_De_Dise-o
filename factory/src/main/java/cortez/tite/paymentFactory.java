package cortez.tite;

import java.util.HashMap;
import java.util.Map;

public class paymentFactory {
    private static final Map<String, PaymentMethod> paymentMethods = new HashMap<>();

    static {
        paymentMethods.put("visa", new Visa());
        paymentMethods.put("mastercard", new MasterCard());
        paymentMethods.put("paypal", new Paypal());
        paymentMethods.put("cash", new Cash());
    }

    public static double createPaymentMethod(String type, double amount) {
        type = type.toLowerCase();

        return paymentMethods.get(type).totalToPay(amount);
    }
}
