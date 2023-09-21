package apis;

import managers.PaymentModeManager;
import models.PaymentModeCategory;

public class AddPaymentModeSupportAPI {

    PaymentModeManager paymentModeManager = new PaymentModeManager();

    void addPaymentModeSupport(String clientName, PaymentModeCategory category){

        paymentModeManager.addPaymentModeSupport(clientName, category);
    }
}
