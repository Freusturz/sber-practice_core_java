package ru.sber.OOP1;

public enum PizzaSize {
        SMALL("Маленькая"),
        MEDIUM("Средняя"),
        BIG("Большая");

        private final String sizeAsString;

        PizzaSize(String sizeAsString) {
            this.sizeAsString = sizeAsString;
        }

        public String toString() {
            return sizeAsString;
        }
}
