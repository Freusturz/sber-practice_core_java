package ru.sber.Annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Target(ElementType.TYPE)
public @interface DayWeek {
    int dayWeek() default 0;
}