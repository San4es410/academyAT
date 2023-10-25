package main;

import atms.Atm;
import cards.Card;
import cards.CreditCard;
import cards.DebitCard;

public class Main {

    public static void main(String[] args) {

        Card cardSasha = new DebitCard("Sasha", 1000);
        Card cardMisha = new CreditCard("Misha", 3000);
        Card illegal = new DebitCard("illegal", -1500);

        Atm atmSasha = new Atm(cardSasha);
        Atm atmMisha = new Atm(cardMisha);

        atmSasha.addMoney(500);
        atmSasha.viewBalance();
        atmSasha.takeMoney(5000);
        atmSasha.viewBalance();

        atmMisha.takeMoney(7000);
        atmMisha.viewBalance();
        atmMisha.addMoney(2000);
        atmMisha.viewBalance();
    }
}
