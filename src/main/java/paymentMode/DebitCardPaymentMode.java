package paymentMode;

import banks.Bank;
import banks.PNBBank;

import java.util.Map;

public class DebitCardPaymentMode extends PaymentMode {

    public DebitCardPaymentMode(Map<String, String> paymentInfo) {
        super(paymentInfo);
    }

    @Override
    public Bank getPaymentProcessingBank() {
        return new PNBBank(paymentInfo);
    }
}
