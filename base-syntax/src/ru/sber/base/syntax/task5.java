package ru.sber.base.syntax;

public class task5 {
    public static void main(String[] args) {

        int[] massiv = new int[30];
        int attempt = 0;
        int number = 0;
        int i = 2;

        while(i < 100){
            int j = 2;
            while(j <= i && attempt < 2){
                if(i % j == 0){
                 attempt += 1;
                }
                j++;
            }
            if(attempt == 1){
                massiv[number] = i;
                number += 1;
            }
            i++;
            attempt = 0;
        }
        System.out.print("Простые числа от 0 до 100:");
        i = 0;
        for(i = 0; i < number; i++ ){
            System.out.println(massiv[i]);
        }

    }
}