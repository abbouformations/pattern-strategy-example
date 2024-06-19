package ma.formation.strategy;

import ma.formation.strategy.service.Article;
import ma.formation.strategy.service.CreditCardStrategy;
import ma.formation.strategy.service.Panier;
import ma.formation.strategy.service.PaypalStrategy;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Panier panier = new Panier();

        Article article1 = Article.builder().
                code(UUID.randomUUID().toString()).
                price(1500.0).
                build();

        Article article2 = Article.builder().
                code(UUID.randomUUID().toString()).
                price(2500.0).
                build();

        panier.addArticle(article1);
        panier.addArticle(article2);

        //payer par paypal
        panier.pay(PaypalStrategy.builder().
                emailId("foulane@gmail.com").
                password("passw@rd").
                build());
        //payer par une carte de crédit
        panier.pay(CreditCardStrategy.builder().
                cvv("786").
                name("Foulane Ahmed").
                cardNumber("1234567890123456").
                dateOfExpiry("10-01-2026").
                build());
    }
}