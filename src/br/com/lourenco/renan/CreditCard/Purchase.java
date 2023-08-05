package br.com.lourenco.renan.CreditCard;

public class Purchase {

    private String item;
    private double value;
    public Purchase(String item, double value){
        this.item = item;
        this.value = value;
    }


    public double getValue() {
        return value;
    }


    public String getItem() {
        return item;
    }

    @Override
    public String toString() {
        return  getItem() + "-" + getValue();
    }
}
