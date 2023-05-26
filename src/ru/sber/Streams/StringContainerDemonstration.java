package ru.sber.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringContainerDemonstration {
    private static final Random rng = new Random();

    public static void main(String[] args) {
    //HM1
        Stream.generate(new Random()::nextInt).filter(num -> num >= 10 && num <= 99)
                .limit(10).sorted().collect(Collectors.averagingInt(value -> value));
    //HM2
        //Создайте класс-контейнер StreamContainer с полем name:String и count:long
        //StringContainer class
    //HM3
        Stream.Builder<String> builder = Stream.builder();

        Stream<String> monologue = builder.add("что").add("то").add("не").add("понятное").build();

        Stream<StringContainer> StreamContainers = monologue.map( xd -> new StringContainer(xd, rng.nextInt()));

        Map<Integer, String> map = StreamContainers
                .collect(Collectors.toMap(container -> container.count, container -> container.name));
        //HM4 -> demo2

    }
}
