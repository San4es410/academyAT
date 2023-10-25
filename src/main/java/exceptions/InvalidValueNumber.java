package exceptions;

public class InvalidValueNumber extends Exception {

    public InvalidValueNumber() {

        System.out.println("Введённые/полученные данные не могут быть отрицательными");
    }
}
