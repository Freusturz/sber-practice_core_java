package ru.sber.exceptions;

import java.util.Locale;
public class InvalidArgumentException extends BankOnlineException {
    public InvalidArgumentException(String argumentName, String reason) {
        super(String.format(Locale.US,"Переданный аргумент %s является валидным: %s", argumentName, reason));
    }
}
