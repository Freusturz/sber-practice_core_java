package ru.sber.exceptions;

import java.io.IOException;
public class BankOnlineDemo extends BankOnline {

    public static void main(String[] args) throws IOException, InvalidCardNumberException, InvalidArgumentException, OutOfLimitTransferException, TransferToBlockedCardException {

        BankOnline bank = new BankOnline();

        //bank.send("1234123412341234",50000.1);// money > 50000

        //bank.send("12341234123412341234",50.0); //line.length != 16

        //bank.send("1234123412341234",-1.0); //false, money < 0

        bank.send("1111111111111111",49.0); //true

    }

}
