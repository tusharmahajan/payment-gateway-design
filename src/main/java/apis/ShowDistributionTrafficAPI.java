package apis;

import managers.BankTrafficManager;

import java.util.Map;

public class ShowDistributionTrafficAPI {

    BankTrafficManager bankTrafficManager = new BankTrafficManager();

    public Map<String, Double> getBankDistributionData(){
        return bankTrafficManager.getDistributionTraffic();
    }
}
