package ru.sber.Reflection;

import lombok.NonNull;
import ru.sber.Annotations.DayWeek;
import ru.sber.Annotations.Plan;
import ru.sber.Annotations.DataContainer;
import ru.sber.Annotations.BaseClass;
import ru.sber.Annotations.NoAnnotationClass;
import ru.sber.Annotations.WithAnnotationClass;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class DataReflection {

    private DataReflection() {
    }

    private static final List<Class<? extends BaseClass>> reflectionChoices = List.of(
            NoAnnotationClass.class,
            WithAnnotationClass.class
    );

    private static Class<? extends BaseClass> findClassByAnnotation(int dayOfTheWeek) {
        for (Class<? extends BaseClass> clazz : reflectionChoices) {
            if (clazz.getAnnotation(DayWeek.class).dayWeek() == dayOfTheWeek) {
                return clazz;
            }
        }

        return null;
    }


    public static BaseClass construct(int dayWeek, String description) throws Exception {
        Class<? extends BaseClass> clazzMetadata = findClassByAnnotation(dayWeek);

        Objects.requireNonNull(clazzMetadata);

        BaseClass instance = clazzMetadata.getConstructor().newInstance();
        Method setter = clazzMetadata.getMethod("setData", String.class);
        setter.invoke(instance, description);

        return instance;
    }

    public static void applyChanges(@NonNull BaseClass instance) throws Exception {
        Method setter = instance.getClass().getMethod("setData", String.class);
        Plan[] Plans = setter.getAnnotationsByType(Plan.class);

        Arrays.sort(Plans, Comparator.comparingInt(Plan::precedence ));

        for (Plan schedule : Plans) {
            setter.invoke(instance, schedule.specification());
        }
    }

    public static DataContainer extract(@NonNull BaseClass instance) throws Exception {
        Field containerField = BaseClass.class.getDeclaredField("container");

        containerField.setAccessible(true);
        return (DataContainer) containerField.get(instance);
    }

}
