package managers;

import banks.Bank;
import data.DBAccessor;

import java.util.Map;

public class BankTrafficManager {


    public boolean checkAndAllocateBankTraffic(Bank bank) {

        int totalTraffic = DBAccessor.getTotalBankTraffic();
        int bankTraffic = DBAccessor.getBankPaymentTraffic(bank);

        if(totalTraffic == 0) return true;
        int limit = bank.permissibleTrafficInPercentage();
        return limit > (bankTraffic/totalTraffic);
    }

    public Map<String, Double> getDistributionTraffic() {
        return DBAccessor.getDistributionTraffic();
    }
}
