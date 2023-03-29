import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class BankOnline {

    public List<String> blockCard;

    public BankOnline(String blockedCardNumber) throws IOException {
        List<String> blockCard = new ArrayList<>();
        blockCard.add(blockedCardNumber);
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

        if (cardNumber.length() != 16) {
            throw new InvalidCardNumberException(cardNumber, "Длина карты не равна 16");
        }

        if (!cardNumber.matches("^[0-9]*$")) {
            throw new InvalidCardNumberException(cardNumber, "Карта введена неверно, кроме цифр есть неопознанные знаки");
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("1111111111111111");
        list.add("2222222222222222");
        list.add("3333333333333333");

        if (list.contains(cardNumber)){
            throw  new TransferToBlockedCardException(cardNumber);
        }

    }
}
