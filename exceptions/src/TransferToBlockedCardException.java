import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Collection;
import java.util.ArrayList;
public class TransferToBlockedCardException extends Throwable {

    public final String blockedCard;

    public TransferToBlockedCardException(String cardNumber) {

        super(String.format(Locale.US,"Произведена попытка перевода на заблокированную карту %s", cardNumber));

        this.blockedCard = cardNumber;
    }

}