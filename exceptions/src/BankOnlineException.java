public class BankOnlineException {
    public final String descript;

    public BankOnlineException() {
        this.descript = "Неизвестная ошибка.";
    }

    public BankOnlineException(String descript) {
        this.descript = descript;
    }
}
