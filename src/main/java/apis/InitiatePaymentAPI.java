package apis;

import managers.TransactionManager;
import models.PaymentModeCategory;
import paymentMode.PaymentMode;
import paymentMode.PaymentsManagerFactory;

import java.util.Map;

public class InitiatePaymentAPI {

    private final TransactionManager transactionManager = new TransactionManager();
    public void initiatePayment(PaymentModeCategory paymentMode, Map<String, String> paymentInfo){

        PaymentMode paymentModeManager = PaymentsManagerFactory.getPaymentMode(paymentMode, paymentInfo);
        transactionManager.initiatePayment(paymentModeManager);
    }
}
