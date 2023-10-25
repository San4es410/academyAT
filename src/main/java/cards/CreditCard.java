package cards;

public class CreditCard extends Card {

    public CreditCard(String name) {
        super(name);
    }

    public CreditCard(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void takeMoney(double money) {
        balance -= money;

    }

    public static void main(String[] args) {

        Card card = new CreditCard("fgfg", 1000);
        card.takeMoney(4000);
        card.viewBalance();
    }
}
