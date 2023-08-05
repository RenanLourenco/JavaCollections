import br.com.lourenco.renan.CreditCard.CreditCard;
import br.com.lourenco.renan.CreditCard.Purchase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        int creditCardLimit = read.nextInt();
        CreditCard creditCard = new CreditCard(creditCardLimit);

        int execute = 0;

        while(execute == 0){
            read.nextLine();
            System.out.println("Digite a descrição do item: ");
            String item = read.nextLine();
            System.out.println("Digite o valor do item: ");
            double itemValue = read.nextDouble();

            if(creditCard.getCreditLimit() > itemValue){
                creditCard.makePurchase(new Purchase(item,itemValue));
            }else {
                System.out.println("Limite insuficiente");
                execute = 1;
            }
            System.out.println("Digite 1 para continuar ou 0 para sair");
            int choose = read.nextInt();
            if(choose == 0){
                creditCard.bankroll();
            }
        }





    }




}
