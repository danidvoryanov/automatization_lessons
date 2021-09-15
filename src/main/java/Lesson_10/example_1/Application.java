package Lesson_10.example_1;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Application {
    public static void main(String[] args) throws Exception {

        File inputFile = new File("src/main/java/Lesson_10/example_1/input.txt");
        File outputFile = new File("src/main/java/Lesson_10/example_1/output.txt");

        Map<String, String> content = FileHelper.readFile(inputFile);

        FileHelper.saveFile(outputFile, content);
    }
}
