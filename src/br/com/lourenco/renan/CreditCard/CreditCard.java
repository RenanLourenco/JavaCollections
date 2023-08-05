package br.com.lourenco.renan.CreditCard;

import java.util.*;

public class CreditCard {
    private List<Purchase> purchases;
    private double creditLimit;

    public CreditCard(double creditLimit){
        this.creditLimit = creditLimit;
        this.purchases = new ArrayList<>();
    }

    public void makePurchase(Purchase items){
        this.purchases.add(items);
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public List<Purchase> sortPurchases(){
        purchases.sort(Comparator.comparing(Purchase::getValue));
        return purchases;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void bankroll(){
        sortPurchases();

        System.out.println("***********************");
        System.out.println("Compras realizadas:");

        for (Purchase c : purchases){
            System.out.println(c.getItem() + " - " + c.getValue());
        }

        System.out.println("**********************");
        System.out.println("Saldo: " + getCreditLimit());

    }
}
