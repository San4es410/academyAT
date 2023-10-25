package cards;

import exceptions.InvalidValueNumber;
import exceptions.NotEnoughMoney;
import interfaces.MoneyOperation;

public abstract class Card implements MoneyOperation {

    protected String name;
    protected double balance;

    public Card(String name) {
        this.name = name;
    }

    public Card(String name, double balance) {
        this.name = name;

        try {
            if (balance >= 0) {
                this.balance = balance;
            } else {
                throw new InvalidValueNumber();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void addMoney(double money) {

        try {
            if (money > 0) {
                balance += money;
            } else {
                throw new InvalidValueNumber();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void takeMoney(double money) {

        try {
            if ((balance >= money)) {
                balance -= money;
            } else {
                throw new NotEnoughMoney();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void viewBalance() {
        System.out.println(balance);
    }
}
