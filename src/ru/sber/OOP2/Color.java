package ru.sber.OOP2;
public enum Color {
    White("Белый"),
    Yellow("Желтый"),
    Black("Черный"),
    Brown("Коричневый"),
    Pink("Розовый");

    private final String colorName;

    Color(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public String toString() {
        return colorName;
    }
}
