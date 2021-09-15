package Lesson_10.example_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileHelper {

    public static void write(List<String> content) {
        try(FileWriter fileWriter = new FileWriter(Config.OUTPUT_FILE)) {
            for (String line : content) {
                fileWriter.write(line + System.lineSeparator());
                fileWriter.flush();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

