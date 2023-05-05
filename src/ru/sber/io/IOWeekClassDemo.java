package ru.sber.io;

import ru.sber.Annotations.DataContainer;
import ru.sber.Annotations.BaseClass;
import ru.sber.Reflection.DataReflection;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class IOWeekClassDemo {
    public static void createLog() throws Exception{

        Path Log = Path.of("log");
        Files.createDirectories(Log);

    }

    public static void deleteLog() throws IOException {

        Path logFolder = Path.of("log");

        try (Stream<Path> fileCounter = Files.list(logFolder)) {
            if (fileCounter.count() > 2) {
                try (Stream<Path> files = Files.list(logFolder)) {
                    files.filter(Files::isRegularFile).map(Path::toFile).forEach(File::delete);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        //BaseClass instClass = DataReflection.construct(3, "what?", 0, 0);

        //DataReflection.applyChanges(instClass);

        //DataContainer container = DataReflection.extract(instClass);
        //container.getSpecification(); ????
    }
}
