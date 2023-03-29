
import java.util.Locale;
public class InvalidArgumentException extends Throwable {
    public InvalidArgumentException(String argumentName, String reason) {
        super(String.format(Locale.US,"Переданный аргумент %s является валидным: %s", argumentName, reason));
    }
}
