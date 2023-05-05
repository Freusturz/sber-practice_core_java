package ru.sber.io;

import ru.sber.Annotations.DayWeek;
import ru.sber.Annotations.Plan;
import ru.sber.Annotations.BaseClass;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Date;

@DayWeek(dayWeek = 3)
public class IOWeekClass extends BaseClass {

    private final OutputStreamWriter writer;

    private void writeToFile(String description) throws IOException {
        Class<? extends IOWeekClass> clazz = this.getClass();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

        writer.write(String.format("%s.%s(\"%s\")\n", clazz.getName(), stackTrace[2].getMethodName(), description));
        writer.flush();
    }

    public IOWeekClass() throws FileNotFoundException {

        FileOutputStream outputStream = new FileOutputStream(String.format("log/%td-%<tm-%<tY %<tH.%<tM.%<tS", new Date()));

        this.writer = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
    }

    @Override
    @Plan(hours = 3, precedence = -1, specification = "Реально какое-то бесполезное описание, все равно перезаписал")
    @Plan(hours = 6, specification = "Оно вроде полезное, жалко что все равно перезаписал")
    @Plan(hours = 9, precedence = 1, specification = "А вот это действительно что-то интересное!")
    public void setData(String specification) {
        this.container.setSpecification(specification);

        try {
            writeToFile(specification);
        } catch (IOException ignored) {

        }
    }

}