package models;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
public class Client {

    private final String id;
    private final String name;
    private final List<PaymentModeCategory> supportedPaymentModes;

    public Client(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.supportedPaymentModes = new ArrayList<>();
    }

    public void addPaymentMode(PaymentModeCategory category){
        supportedPaymentModes.add(category);
    }

    public void removePaymentMode(PaymentModeCategory category){
        supportedPaymentModes.remove(category);
    }
}
