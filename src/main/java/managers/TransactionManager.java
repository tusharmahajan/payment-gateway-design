package managers;

import banks.Bank;
import data.DBAccessor;
import paymentMode.PaymentMode;


public class TransactionManager {

    BankTrafficManager bankTrafficManager = new BankTrafficManager();

    public void initiatePayment(PaymentMode paymentModeManager){
        Bank bank  = paymentModeManager.getPaymentProcessingBank();
        boolean canAllocate = bankTrafficManager.checkAndAllocateBankTraffic(bank);

        if(canAllocate){
            DBAccessor.updateTrafficForBank(bank);
            bank.initiatePayment();
        }
    }

}
