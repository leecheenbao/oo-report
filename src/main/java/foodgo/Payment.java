package foodgo;

public abstract class Payment {
    private final String paymentId;
    private final double amount;

    protected Payment(String paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public abstract boolean charge();
}
