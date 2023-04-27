package ru.sber.StringDataTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class HM5 {
    private static final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public static long Age(String dataNow, String Birthday) {

        return Math.abs(ChronoUnit.YEARS.between(LocalDate.parse(Birthday, format), LocalDate.parse(dataNow, format)));
    }
    public static void main(String[] args) {
        System.out.println(Age("29.03.2023", "30.03.1973"));
    }
}
