package ru.sber.exceptions;

import java.util.*;

public class BankOnline {

    public ArrayList<String> blockedCard = new ArrayList<>();

    public BankOnline() {
        blockedCard.add("1111111111111111");
        blockedCard.add("2222222222222222");
        blockedCard.add("3333333333333333");
    }

    public void send(String cardNumber, Double money) throws InvalidArgumentException,
            InvalidCardNumberException,
            OutOfLimitTransferException, TransferToBlockedCardException {
        if (cardNumber == null) {
            throw new InvalidArgumentException("cardNumber", "Передан null объект");
        }

        if (money == null) {
            throw new InvalidArgumentException("money", "Передан null объект");
        }

        if (money < 0) {
            throw new OutOfLimitTransferException(cardNumber, money, 50000.0);
        }

        if (money > 50_000) {
            throw new OutOfLimitTransferException(cardNumber, money, 50000.0);
        }

        if (!cardNumber.matches("^[0-9]{16}$")) {
            throw new InvalidCardNumberException(cardNumber, "Карта введена неверно, неверная длина или кроме цифр есть неопознанные знаки");
        }

        if (blockedCard.contains(cardNumber)){
            throw  new TransferToBlockedCardException(cardNumber);
        }

    }
}
