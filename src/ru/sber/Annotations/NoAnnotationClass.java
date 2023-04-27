package ru.sber.Annotations;

import lombok.NonNull;

public class NoAnnotationClass extends BaseClass {
    @Plan(hours = 10, precedence = -1, specification = "Возвращает текст c аннотацией")
    @Plan(hours = 15)
    @Plan(hours = 20, precedence = 1)
    public void setData(@NonNull String specification) {

        this.container.setSpecification(specification);

    }
}
