package ru.sber.Reflection;

import ru.sber.Annotations.DataContainer;
import ru.sber.Annotations.BaseClass;


public class DataReflectionDemo {
    private static BaseClass instClazz = null;
    public static void main(String[] args) throws Exception{
        //instClazz = DataReflection.construct(3, "", 6, 9);
        //System.err.println(instClazz);

        //DataContainer container = DataReflection.extract(instClazz);
        //container.getPrecedence();
        //container.getSpecification();


        //DataReflection.applyChanges(instClazz);

        //DataContainer container = DataReflection.extract(instClazz);
        //container.getPrecedence();
        //container.getSpecification("С обычной аннотацией вроде");
    }
}
