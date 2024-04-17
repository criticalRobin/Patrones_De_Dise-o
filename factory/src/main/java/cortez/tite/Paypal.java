package cortez.tite;

public class Paypal implements PaymentMethod {
    public double totalToPay(double amount) {
        return amount + (amount * 0.06);
    }
}
