package ru.sber.Annotations;

@DayWeek(dayWeek = 1)

public abstract class BaseClass {
    protected DataContainer container;
    public abstract void setData(String specification);
}
