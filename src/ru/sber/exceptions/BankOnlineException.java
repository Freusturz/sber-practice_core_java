package ru.sber.exceptions;

public class BankOnlineException extends Exception {

    public final String descript;

    public BankOnlineException() {
        this.descript = "Неизвестная ошибка.";
    }

    public BankOnlineException(String descript) {

        this.descript = descript;
    }
}
