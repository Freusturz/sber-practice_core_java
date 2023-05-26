package ru.sber.Annotations;

import lombok.NonNull;

import java.io.FileNotFoundException;
import java.io.IOException;

@DayWeek(dayWeek = 2)
public class WithAnnotationClass extends BaseClass {

    public WithAnnotationClass() throws FileNotFoundException {}

    @Plan(hours = 11, precedence = -1, specification = "Возвращает текст с аннотацией")
    @Plan(hours = 16)
    @Plan(hours = 21, precedence = 1)
    public void setData(@NonNull String specification) {
        this.container.setSpecification(specification);

        try {
            this.writeToFile(specification);
        } catch (IOException ignored) {

        }
    }
}