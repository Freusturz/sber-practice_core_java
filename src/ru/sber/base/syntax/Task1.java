package ru.sber.base.syntax;

class ArrayBubble {
    private long[] massiv;
    private int num;

    public ArrayBubble(int max){
        massiv = new long[max];
        num = max;
    }

    public void into(int Chislo){
        for(int i = Chislo - 1; i > 0; i--){
            massiv[i] = (int) (Math.random() * 1000) + 1;
        }
    }

    public void printer(){
        System.out.println("Массив после сортировки");
        for (int i = 0; i < num; i++){
            System.out.print(massiv[i] + " ");
            System.out.println("");
        }
    }

    public void printers(){
        System.out.println("Массив до сортировки");
        for (int i = 0; i < num; i++){
            System.out.print(massiv[i] + " ");
            System.out.println("");
        }
    }

    private void Swap(int first, int second){
        long dummy = massiv[first];
        massiv[first] = massiv[second];
        massiv[second] = dummy;
    }

    public void bubbleSort(){
        for (int out = num - 1; out >= 1; out--){
            for (int i = 0; i < out; i++){
                if(massiv[i] > massiv[i + 1])
                    Swap(i, i + 1);
            }
        }
    }
}
//public class task1 {
//    public static void main(String[] args) {
//        int Chislo = 11;
//        ArrayBubble array = new ArrayBubble(Chislo);
//        array.into(Chislo);
//        array.printers();
//        array.bubbleSort();
//        array.printer();
//    }
//}
