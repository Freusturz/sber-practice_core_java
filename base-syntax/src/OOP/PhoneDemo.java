package OOP;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.receiveCall("Денис Верзаков");
        phone.sendMessage(new String[] { "900", "890959755**", "04", "135", "0" });

        Phone sberPhone = new Phone("900", "Iphone 15 pro");
        Phone actualPhone = new Phone("890959755**", "Iphone 15 pro", 546);

        sberPhone.receiveCall("Реклама", "890959755**");
        System.out.println(actualPhone.getNumber());
    }
}
