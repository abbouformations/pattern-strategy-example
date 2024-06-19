package ma.formation.strategy.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PaypalStrategy implements PaymentStrategy {
    private String emailId;
    private String password;

    @Override
    public void pay(Double amount) {
        //implémenter votre logique métier ici.
        System.out.println(amount + " paid using Paypal.");
    }
}