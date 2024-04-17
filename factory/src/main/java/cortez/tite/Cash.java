package cortez.tite;

public class Cash implements PaymentMethod {
    public double totalToPay(double amount) {
        return amount - (amount * 0.1);
    }
}
