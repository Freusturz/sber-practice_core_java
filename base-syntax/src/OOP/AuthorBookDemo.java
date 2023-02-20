package OOP;
import java.util.Scanner;
public class AuthorBookDemo {
    public static void main(String[] args) {
        Author lewis = new Author("Илья Щиплецов", "Мужской");
        Book Stalker = new Book("Ассемблер для Contract Wars на c#", lewis, 2016);

        System.out.println(lewis);
        System.out.println(Stalker);

        Author ContractWars = new Author("Дима Миневич", "Мужской", null);

        Book Permanent = new Book("Илюша читер", ContractWars, 2018);
        Permanent.setYear(2018);

        System.out.println(ContractWars);
        System.out.println(Permanent);
    }
}
