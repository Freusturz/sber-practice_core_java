package ru.sber.exceptions;

import java.util.Locale;
public class InvalidCardNumberException extends BankOnlineException {

    public final String cardNumber;

    public InvalidCardNumberException(String cardNumber, String whatWrong) {
        super(String.format(Locale.US,"Номер карты %s должен состоять из 16 цифер %s", cardNumber, whatWrong));

        this.cardNumber = cardNumber;
    }

}
