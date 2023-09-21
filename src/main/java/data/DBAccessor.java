package data;


import banks.Bank;
import models.BankName;
import models.Client;
import models.PaymentModeCategory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DBAccessor {

    private static final List<Client> clients = new ArrayList<>();
    private static final Map<Bank, Integer> bankTraffic = new HashMap<>();

    private DBAccessor(){}

    public static DataAccessorResult getUser() {
        return null;
    }

    public static void addClientSupport(String clientName) {
        clients.add(new Client(clientName));
    }

    public static void removeClientSupport(String clientName) {
        clients.removeIf(client -> client.getName().equals(clientName));
    }

    public static Client getClientData(String clientName) {
        List<Client> clientList = clients.stream().filter(client -> client.getName().equals(clientName)).collect(Collectors.toList());
        return clientList.get(0);
    }

    public static int getTotalBankTraffic() {
        int cnt = 0;
        for(Map.Entry<Bank, Integer> map : bankTraffic.entrySet()){
            cnt+=map.getValue();
        }
        return cnt;
    }

    public static int getBankPaymentTraffic(Bank bank) {
        return bankTraffic.getOrDefault(bank, 0);
    }

    public static void addPaymentModeSupport(String clientName, PaymentModeCategory paymentModeCategory) {
        Client client = getClientData(clientName);
        client.addPaymentMode(paymentModeCategory);
    }

    public static void removePaymentModeSupport(String clientName, PaymentModeCategory paymentModeCategory) {
        Client client = getClientData(clientName);
        client.removePaymentMode(paymentModeCategory);
    }

    public static List<PaymentModeCategory> getSupportedPaymentModesForClient(String clientName) {
        Client client = getClientData(clientName);
        return client.getSupportedPaymentModes();
    }

    public static void updateTrafficForBank(Bank bank) {
        int cnt = bankTraffic.getOrDefault(bank, 0);
        bankTraffic.put(bank, cnt+1);
    }

    public static Map<String, Double> getDistributionTraffic() {
        Map<String, Double> result = new HashMap<>();

        Double totalTraffic = (double) getTotalBankTraffic();

        for(Map.Entry<Bank, Integer> map : bankTraffic.entrySet()){
             String bankName = map.getKey().getBankName().toString();
             Double trafficPercentage = (map.getValue()/totalTraffic)*100;
             result.put(bankName, trafficPercentage);
        }
        return result;
    }
}
