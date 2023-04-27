package ru.sber.StringDataTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class HM6 {
    private static final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public static List<LocalDate> daysBetweenDates(String beginDate, String endDate) {
        LocalDate firstDate = LocalDate.parse(beginDate, format);
        LocalDate lastDate = LocalDate.parse(endDate, format);

        List<LocalDate> dates = new ArrayList<>(firstDate.datesUntil(lastDate, Period.ofDays(1)).toList());
        dates.add(lastDate);
        return dates;
    }

    public static void main(String[] args) {
        System.out.println(daysBetweenDates("20.12.2023", "03.01.2024"));
    }
}
