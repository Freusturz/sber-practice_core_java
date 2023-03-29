import java.io.IOException;
import java.util.Scanner;
public class BankOnlineDemo extends BankOnline{

    public BankOnlineDemo(String blockedCardNumbersFile) throws IOException {
        super(blockedCardNumbersFile);
    }

    public static void main(String[] args) throws IOException, InvalidCardNumberException, InvalidArgumentException, OutOfLimitTransferException, TransferToBlockedCardException {
        Scanner scanner = new Scanner(System.in);

        BankOnline bank = new BankOnline("");

        //bank.send("1234123412341234",50000.1);// money > 50000

        //bank.send("12341234123412341234",50.0); //line.length != 16

        //bank.send("1234123412341234",-1.0); //false, money < 0

        bank.send("1111111111111111",49.0); //true



    }
}
