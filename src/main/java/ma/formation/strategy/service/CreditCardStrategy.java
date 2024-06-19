package ma.formation.strategy.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    @Override
    public void pay(Double amount) {
        //implémenter votre logique métier ici.
        System.out.println(amount + " paid with credit/debit card");
    }
}