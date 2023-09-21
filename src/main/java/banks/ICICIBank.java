package banks;

import models.BankName;

import java.util.Map;

public class ICICIBank implements Bank {


    public ICICIBank(Map<String, String> paymentInfo) {

    }

    @Override
    public void initiatePayment() {

    }

    @Override
    public BankName getBankName() {
        return BankName.ICICI;
    }

    @Override
    public int permissibleTrafficInPercentage() {
        return 30;
    }

}
