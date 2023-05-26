package ru.sber.Annotations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Date;

@DayWeek(dayWeek = 1)

public abstract class BaseClass {
    private final OutputStreamWriter writer;
    protected DataContainer container;

    public BaseClass() throws FileNotFoundException {
        FileOutputStream outputStream = new FileOutputStream(String.format("log/%td-%<tm-%<tY %<tH.%<tM.%<tS", new Date()));

        this.writer = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
    }

    protected void writeToFile(String description) throws IOException {
        Class<? extends BaseClass> clazz = this.getClass();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

        writer.write(String.format("%s.%s(\"%s\")\n", clazz.getName(), stackTrace[2].getMethodName(), description));
        writer.flush();
    }

    public abstract void setData(String specification);

}
