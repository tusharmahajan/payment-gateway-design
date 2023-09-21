package banks;

import models.BankName;

import java.util.Map;

public class KotakBank implements Bank {


    public KotakBank(Map<String, String> paymentInfo) {

    }

    @Override
    public void initiatePayment() {

    }

    @Override
    public BankName getBankName() {
        return BankName.KOTAK;
    }

    @Override
    public int permissibleTrafficInPercentage() {
        return 0;
    }

}
