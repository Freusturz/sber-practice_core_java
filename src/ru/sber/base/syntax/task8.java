package ru.sber.base.syntax;

import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {

        System.out.println("Отгадайте, что это такое: синий, большой, с усами и полностью набит зайцами?");
        System.out.println("У вас есть 3 попытки чтобы отгадать.");
        System.out.println("Любое введеное слово = попытка");
        System.out.println("При вводе слова \"Сдаюсь\" Вам будет выдан ответ");
        System.out.println("Введите вашу догадку:");

        int attempt = 3;
        Scanner scanner = new Scanner(System.in);

        while (attempt > 0) {
            String str = scanner.nextLine();
            switch (str.toLowerCase()) {
                case "троллейбус": {
                    System.out.println("Правильно!");
                    return;
                }

                case "сдаюсь": {
                    System.out.println("Правильный ответ: троллейбус");
                    return;
                }

                default: {
                    if(attempt > 1) {
                        System.out.println("Подумай ещё");
                        attempt--;
                    }
                    else {
                        attempt--;
                    }
                }
            }
            if(attempt == 0){
                System.out.println("Вы проиграли(");
                System.out.println("Правильный ответ: троллейбус");
            }
        }

        System.out.println();
    }
}