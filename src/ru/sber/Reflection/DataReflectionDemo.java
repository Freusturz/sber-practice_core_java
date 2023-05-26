package ru.sber.Reflection;

import ru.sber.Annotations.DataContainer;
import ru.sber.Annotations.BaseClass;


public class DataReflectionDemo {
    public static void main(String[] args) throws Exception{
        BaseClass instClazz = DataReflection.construct(2, "");
        System.err.println(instClazz);

        DataContainer container = DataReflection.extract(instClazz);
        container.getPrecedence();
        container.getSpecification();

        DataReflection.applyChanges(instClazz);

        container = DataReflection.extract(instClazz);
        container.getPrecedence();
        container.setSpecification("С обычной аннотацией вроде");
    }
}
