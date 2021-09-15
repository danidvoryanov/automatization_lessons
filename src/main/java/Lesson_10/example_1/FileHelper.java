package Lesson_10.example_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileHelper {

    public static Map<String, String> readFile(File file) throws Exception {
        List<String> input = Files.readAllLines(Paths.get(file.getAbsolutePath()));
        Map<String, String> result = new HashMap<>();
        for (String line : input
        ) {
            String key = line.split("=")[0];
            if (line.split("=").length == 1) {
                String value = "[]";
                result.put(key, value);
                continue;
            }
            String value = parse(line.split("=")[1]);
            result.put(key, value);
        }
        return result;
    }

    public static String parse(String value) {
        String defaultValue = "\"" + value + "\"";
        if (value.equals(null)) return null;
        if (value.equals("")) return "[]";
        if (value.contains(".")) {
            try {
                return String.valueOf(Double.parseDouble(value));
            } catch (NumberFormatException e) {
                return defaultValue;
            }
        }

        try {
            return String.valueOf(Long.parseLong(value));
        } catch (NumberFormatException ignore) {
        }

        return value.equals("true") || value.equals("false") ? value : defaultValue;
    }

    public static void saveFile(File file, Map<String, String> content) {
        StringBuilder sb = new StringBuilder("{");
        sb.append(System.lineSeparator());
        for (Map.Entry<String, String> entry : content.entrySet()) {
            sb.append(String.format("  \"%s\": %s,%n", entry.getKey(), entry.getValue()));
        }
        int lastComa = sb.lastIndexOf(",");
        sb.replace(lastComa, lastComa + 1, "");
        sb.append("}");
        String output = sb.toString();
        System.out.println(output);

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(output);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
