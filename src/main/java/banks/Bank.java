package banks;

import models.BankName;

public interface Bank {

    void initiatePayment();
    BankName getBankName();
    int permissibleTrafficInPercentage();
}
