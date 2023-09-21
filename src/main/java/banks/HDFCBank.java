package banks;

import models.BankName;

import java.util.Map;

public class HDFCBank implements Bank {

    public HDFCBank(Map<String, String> paymentInfo) {

    }

    @Override
    public void initiatePayment() {

    }

    @Override
    public BankName getBankName() {
        return BankName.HDFC;
    }

    @Override
    public int permissibleTrafficInPercentage() {
        return 40;
    }

}
