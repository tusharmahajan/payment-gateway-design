package paymentMode;

import banks.Bank;
import banks.KotakBank;

import java.util.Map;

public class UPIPaymentMode extends PaymentMode {

    public UPIPaymentMode(Map<String, String> paymentInfo) {
        super(paymentInfo);
    }

    @Override
    public Bank getPaymentProcessingBank() {
        return new KotakBank(paymentInfo);
    }
}
