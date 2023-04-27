package ru.sber.base.syntax;

public class task6 {
    public static void main(String[] args) {
        int right = 5;
        int low = 3;
        int i = 0;
        int j = 0;
        while(i < low){
            j = 0;
            while(j < right){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}