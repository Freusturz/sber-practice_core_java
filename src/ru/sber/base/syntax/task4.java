package ru.sber.base.syntax;

public class task4 {
    public static  void Zapolnenie(double massiv[], double Max, double Min){
        for(int i = 0; i < massiv.length; i++){
            massiv[i] = Math.random();
            if(Max < massiv[i]){
                Max = massiv[i];
            }
            Min += massiv[i];
            System.out.format("%f", massiv[i]);

        }
        Min /= massiv.length;
        System.out.println();
        System.out.format("Максимальное: %f\n", Max);
        System.out.format("Среднее %f\n", Min);
    }
    public static void main(String[] args) {
        int numbers = 10;
        double[] massiv = new double[numbers];
        double Max = 0.0;
        double Min = 0.0;
        Zapolnenie(massiv, Max, Min);
    }
}