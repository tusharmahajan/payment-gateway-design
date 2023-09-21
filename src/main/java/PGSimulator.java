import apis.InitiatePaymentAPI;
import models.PaymentModeCategory;

import java.util.HashMap;
import java.util.Map;

public class PGSimulator {

    public static void main(String[] args) {
        InitiatePaymentAPI api = new InitiatePaymentAPI();
        Map<String, String> paymentInfo = new HashMap<>();

        api.initiatePayment(PaymentModeCategory.CREDIT_CARD, paymentInfo);
    }
}
