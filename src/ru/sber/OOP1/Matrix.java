package ru.sber.OOP1;

public class Matrix {
    private final double[][] matrix;

    public final int rowNum;

    public final int columnNum;

    public Matrix(int rowNum, int columnNum) throws IllegalArgumentException {
        this.matrix = new double[rowNum][columnNum];
        this.rowNum = rowNum;
        this.columnNum = columnNum;
    }

    public Matrix setValue(int row, int column, double value) {
        if (row >= rowNum || row < 0) {
            return this;
        }

        if (column >= columnNum || column < 0) {
            return this;
        }

        matrix[row][column] = value;
        return this;
    }

    public Matrix add(Matrix otherMatrix) {
        int row = Math.min(rowNum, otherMatrix.rowNum);
        int column = Math.min(columnNum, otherMatrix.columnNum);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] += otherMatrix.matrix[i][j];
            }
        }

        return this;
    }

    public Matrix multiply(double modifier) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= modifier;
            }
        }

        return this;
    }

    public Matrix multiply(Matrix otherMatrix) {
        int row = Math.min(rowNum, otherMatrix.rowNum);
        int column = Math.min(columnNum, otherMatrix.columnNum);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] *= otherMatrix.matrix[i][j];
            }
        }

        return this;
    }

    public Matrix print() {
        System.out.format("%s\n", this);

        return this;
    }


    public String toString() {
        StringBuilder builder = new StringBuilder(2 * rowNum * columnNum + rowNum);

        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < columnNum; j++) {
                builder.append(matrix[i][j]).append(' ');
            }

            builder.append('\n');
        }

        return builder.toString();
}
}
