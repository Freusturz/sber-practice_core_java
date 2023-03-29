import java.util.Locale;
public class InvalidCardNumberException extends Throwable {

    public final String cardNumber;

    public InvalidCardNumberException(String cardNumber, String whatWrong) {
        super(String.format(Locale.US,"Номер карты %s не является валидным: %s", cardNumber, whatWrong));

        this.cardNumber = cardNumber;
    }

}
