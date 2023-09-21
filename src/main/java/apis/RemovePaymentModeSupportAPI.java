package apis;

import managers.PaymentModeManager;
import models.PaymentModeCategory;

public class RemovePaymentModeSupportAPI {

    PaymentModeManager paymentModeManager = new PaymentModeManager();

    public void removePaymentModeSupport(String clientName, PaymentModeCategory paymentModeCategory){
        paymentModeManager.removePaymentModeSupport(clientName, paymentModeCategory);
    }
}
