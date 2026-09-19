package foodgo;

public class CashPayment extends Payment {
    public CashPayment(String paymentId, double amount) {
        super(paymentId, amount);
    }

    @Override
    public boolean charge() {
        System.out.println("貨到付現,金額於送達時收取: $" + getAmount());
        return true;
    }
}
