package ru.sber.StringDataTime;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class HM1 {
    public static void main(String[] args) {
        String aa = "Hello World";
        String[] stringarray = aa.split("");

        Map<String , Long> map =  Arrays.stream(stringarray)
                .collect(Collectors.groupingBy(c -> c , Collectors.counting()));
        map.forEach( (k, v) -> System.out.println(k + " : "+ v)        );
    }
}