package ru.sber.OOP1;

public class MatrixDemo {
    public static void main(String[] args) {
        final int BASE_ROW_COUNT = 4;
        final int BASE_COLUMN_COUNT = 4;
        final int ADDITION_ROW_COUNT = 3;
        final int ADDITION_COLUMN_COUNT = 2;
        int counter = 0;

        Matrix baseMatrix = new Matrix(BASE_ROW_COUNT, BASE_COLUMN_COUNT);
        for (int i = 0; i < BASE_ROW_COUNT; i++) {
            for (int j = 0; j < BASE_COLUMN_COUNT; j++) {
                baseMatrix.setValue(i, j, counter++);
            }
        }

        System.out.println(baseMatrix);

        Matrix additionMatrix = new Matrix(ADDITION_ROW_COUNT, ADDITION_COLUMN_COUNT);
        for (int i = 0; i < ADDITION_ROW_COUNT; i++) {
            for (int j = 0; j < ADDITION_COLUMN_COUNT; j++) {
                additionMatrix.setValue(i, j, counter--);
            }
        }

        Matrix multiplyMatrix = new Matrix(9, 6);
        for (int i = 0; i < multiplyMatrix.rowNum; i++) {
            for (int j = 0; j < multiplyMatrix.columnNum; j++) {
                multiplyMatrix.setValue(i, j, --counter);
            }
        }

        multiplyMatrix.print();
        baseMatrix.multiply(multiplyMatrix).print();
    }
}
