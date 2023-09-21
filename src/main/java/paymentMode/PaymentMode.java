package paymentMode;

import banks.Bank;

import java.util.Map;

public abstract class PaymentMode {

    protected final Map<String, String> paymentInfo;

    protected PaymentMode(Map<String, String> paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public abstract Bank getPaymentProcessingBank();

}
