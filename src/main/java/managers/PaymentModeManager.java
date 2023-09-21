package managers;

import data.DBAccessor;

import models.PaymentModeCategory;

import java.util.List;

public class PaymentModeManager {

    public void addPaymentModeSupport(String clientName, PaymentModeCategory category) {
        DBAccessor.addPaymentModeSupport(clientName, category);
    }

    public void removePaymentModeSupport(String clientName, PaymentModeCategory paymentModeCategory) {
        DBAccessor.removePaymentModeSupport(clientName, paymentModeCategory);
    }

    public List<PaymentModeCategory> getSupportedPaymentModes(String clientName) {
        return DBAccessor.getSupportedPaymentModesForClient(clientName);
    }
}
