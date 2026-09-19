package foodgo;

public class EWalletPayment extends Payment {
    private final String walletProvider;

    public EWalletPayment(String paymentId, double amount, String walletProvider) {
        super(paymentId, amount);
        this.walletProvider = walletProvider;
    }

    @Override
    public boolean charge() {
        System.out.println(walletProvider + " 電子錢包扣款: $" + getAmount());
        return true;
    }
}
