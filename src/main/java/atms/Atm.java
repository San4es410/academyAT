package atms;

import cards.Card;
import interfaces.MoneyOperation;

public class Atm implements MoneyOperation {

    private Card card;

    public Atm(Card card) {
        this.card = card;

    }

    @Override
    public void addMoney(double money) {
        card.addMoney(money);

    }

    @Override
    public void takeMoney(double money) {
        card.takeMoney(money);

    }

    @Override
    public void viewBalance() {
        System.out.println(card.getBalance());
    }
}
