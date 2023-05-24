package ru.sber.Reflection;

import ru.sber.Annotations.DataContainer;
import ru.sber.Annotations.BaseClass;


public class DataReflectionDemo {
    public static void main(String[] args) throws Exception{
        BaseClass instClazz = DataReflection.construct(3, "");
        System.err.println(instClazz);

        //DataContainer container = DataReflection.extract(instClazz);
        //container.getPrecedence();
        //container.getSpecification();


        //DataReflection.applyChanges(instClazz);

        //DataContainer container = DataReflection.extract(instClazz);
        //container.getPrecedence();
        //container.getSpecification("С обычной аннотацией вроде");
    }
}
