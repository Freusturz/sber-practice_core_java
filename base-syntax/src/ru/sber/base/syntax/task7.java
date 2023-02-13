package ru.sber.base.syntax;

public class task7 {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int number = 0;
        while(number < 11){
            int summa = first + second;
            first = second;
            second = summa;
            System.out.println(summa);
            number++;
        }
    }
}