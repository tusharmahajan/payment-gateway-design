package paymentMode;

import banks.Bank;
import banks.ICICIBank;

import java.util.Map;

public class NetBankingPaymentMode extends PaymentMode {

    public NetBankingPaymentMode(Map<String, String> paymentInfo) {
        super(paymentInfo);
    }

    @Override
    public Bank getPaymentProcessingBank() {
        return new ICICIBank(paymentInfo);
    }
}
