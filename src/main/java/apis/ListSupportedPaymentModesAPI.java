package apis;

import managers.PaymentModeManager;
import models.PaymentModeCategory;

import java.util.List;

public class ListSupportedPaymentModesAPI {

    PaymentModeManager paymentModeManager = new PaymentModeManager();

    public List<PaymentModeCategory> getSupportedPaymentModes(String clientName){
       return paymentModeManager.getSupportedPaymentModes(clientName);
    }
}
