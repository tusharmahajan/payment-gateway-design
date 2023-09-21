package paymentMode;

import banks.Bank;
import banks.HDFCBank;

import java.util.Map;

public class CreditCardPaymentMode extends PaymentMode {

    public CreditCardPaymentMode(Map<String, String> paymentInfo){
        super(paymentInfo);
    }

    @Override
    public Bank getPaymentProcessingBank() {
        return new HDFCBank(paymentInfo);
    }
}
