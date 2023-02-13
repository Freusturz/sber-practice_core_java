package ru.sber.base.syntax;

public class task2 {
    private static void QuickSort(int[] massiv, int low, int high) {
        if (massiv.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        int middle = low + (high - low) / 2;
        int mainstay = massiv[middle];

        int i = low;
        int j = high;

        while (i <= j) {
            while (massiv[i] < mainstay) {
                i++;
            }

            while (massiv[j] > mainstay) {
                j--;
            }

            if (i <= j) {
                int swap = massiv[i];
                massiv[i] = massiv[j];
                massiv[j] = swap;

                i++;
                j--;
            }
        }

        if (low < j) {
            QuickSort(massiv, low, j);
        }

        if (high > i) {
            QuickSort(massiv, i, high);
        }
    }
    private static void quickSort(int[] massiv) {
        QuickSort(massiv, 0, massiv.length - 1);
    }
    private static void ReadMas(int chislo, int[] massiv){

        for(int i = 0; i < chislo; i++){
            massiv[i] = (int) (Math.random() * 1000) + 1;
        }

    }
    private static void printer(int chislo, int[] massiv){
        System.out.println("Массив до сортировки");
        for (int i = 0; i < chislo; i++){
            System.out.print(massiv[i] + " ");
            System.out.println();
        }
    }
    private static void printers(int chislo, int[] massiv){
        System.out.println("Массив после сортировки");
        for (int i = 0; i < chislo; i++){
            System.out.print(massiv[i] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int chislo = 10;
        int[] arrayToSort = new int[chislo];
        ReadMas(chislo,arrayToSort);
        printer(chislo, arrayToSort);
        quickSort(arrayToSort);
        printers(chislo, arrayToSort);
    }
}