package paymentMode;

import models.PaymentModeCategory;

import java.util.Map;

public class PaymentsManagerFactory {

    private PaymentsManagerFactory(){}

    public static PaymentMode getPaymentMode(PaymentModeCategory paymentMode, Map<String, String> paymentInfo){

        if(paymentMode.equals(PaymentModeCategory.UPI)){
            return new UPIPaymentMode(paymentInfo);
        }
        else if(paymentMode.equals(PaymentModeCategory.DEBIT_CARD)){
            return new DebitCardPaymentMode(paymentInfo);

        }
        else if(paymentMode.equals(PaymentModeCategory.CREDIT_CARD)){
            return new CreditCardPaymentMode(paymentInfo);

        }
        else if(paymentMode.equals(PaymentModeCategory.NET_BANKING)){
            return new NetBankingPaymentMode(paymentInfo);
        }
        else throw new IllegalArgumentException("Payment mode not supported");
    }
}
