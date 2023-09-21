package banks;

import models.BankName;

import java.util.Map;

public class PNBBank implements Bank {

    public PNBBank(Map<String, String> paymentInfo) {
    }

    @Override
    public void initiatePayment() {

    }

    @Override
    public BankName getBankName() {
        return BankName.PNB;
    }

    @Override
    public int permissibleTrafficInPercentage() {
        return 0;
    }

}
