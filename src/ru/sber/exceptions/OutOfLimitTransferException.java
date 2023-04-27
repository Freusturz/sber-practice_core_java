package ru.sber.exceptions;

import java.util.Locale;
public class OutOfLimitTransferException extends BankOnlineException {

    public final String cardNumber;

    public final Double requestedTransfer;

    public final Double remainingTransfer;


    public OutOfLimitTransferException(String cardNumber, Double requested, Double remaining) {
        super(String.format(Locale.US,
                "Карта номер %s не способна выполнить запрос %.2f, так как её оставшийся лимит равен %.2f",
                cardNumber,
                requested,
                remaining));

        this.cardNumber = cardNumber;
        this.requestedTransfer = requested;
        this.remainingTransfer = remaining;
    }

}