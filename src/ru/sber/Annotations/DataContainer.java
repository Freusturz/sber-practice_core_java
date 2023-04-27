package ru.sber.Annotations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class DataContainer {

    private String specification;

    private int precedence;

    private double period;

}