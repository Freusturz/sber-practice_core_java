package ru.sber.Annotations;

import lombok.NonNull;

import java.io.FileNotFoundException;
import java.io.IOException;

public class NoAnnotationClass extends BaseClass {

    public NoAnnotationClass() throws FileNotFoundException {}

    @Plan(hours = 10, precedence = -1, specification = "Возвращает текст c аннотацией")
    @Plan(hours = 15)
    @Plan(hours = 20, precedence = 1)
    public void setData(@NonNull String specification) {
        this.container.setSpecification(specification);

        try {
            this.writeToFile(specification);
        } catch (IOException ignored) {

        }
    }
}
