package foodgo;

public class CreditCardPayment extends Payment {
    private final String cardNumberMasked;

    public CreditCardPayment(String paymentId, double amount, String cardNumberMasked) {
        super(paymentId, amount);
        this.cardNumberMasked = cardNumberMasked;
    }

    @Override
    public boolean charge() {
        System.out.println("信用卡(" + cardNumberMasked + ")請款: $" + getAmount());
        return true;
    }
}
