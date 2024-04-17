package cortez.tite;

public class MasterCard implements PaymentMethod {
    public double totalToPay(double amount) {
        return amount + (amount * 0.04);
    }
}
