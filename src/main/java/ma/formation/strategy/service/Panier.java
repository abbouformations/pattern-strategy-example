package ma.formation.strategy.service;

import java.util.ArrayList;
import java.util.List;

public class Panier {
    private List<Article> articles = new ArrayList<>();

    public void addArticle(Article article) {
        articles.add(article);
    }

    public void removeItem(Article article) {
        articles.remove(article);
    }

    public void pay(PaymentStrategy paymentMethod) {
        paymentMethod.pay(articles.stream().
                mapToDouble(Article::getPrice).
                sum());
    }
}