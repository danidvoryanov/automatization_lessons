package Lesson_10.example_4.helpers;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Property {
    public static final Integer EMPLOYEE_LASTNAME_LENGTH;
    public static final Integer EMPLOYEE_FIRSTNAME_LENGTH;
    public static final String EMPLOYEE_NAME_PATTERN;
    public static final Double EMPLOYEE_SALARY_MIN;
    public static final Double EMPLOYEE_SALARY_MAX;
    public static final Integer PASSPORT_SERIES_DIGITS;
    public static final Integer PASSPORT_NUMBER_DIGITS;
    public static final String SALARY_DATE_FORMAT;
    public static final Integer SALARY_EMPLOYEE_COUNT;
    public static final String SALARY_OUTPUT_FILE;
    public static final String CASH_OUTPUT_FILE;
    public static final Double[] CASH_NOMINALS;

    static {
        Properties properties = new Properties();
        String path = "src/main/java/Lesson_10/example_4/application.properties";
        try {
            properties.load(new FileReader(path));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        EMPLOYEE_LASTNAME_LENGTH = Integer.parseInt(properties.getProperty("employee.lastname.length"));
        EMPLOYEE_FIRSTNAME_LENGTH = Integer.parseInt(properties.getProperty("employee.firstname.length"));
        EMPLOYEE_NAME_PATTERN = properties.getProperty("employee.name.pattern");
        EMPLOYEE_SALARY_MIN = Double.parseDouble(properties.getProperty("employee.salary.min"));
        EMPLOYEE_SALARY_MAX = Double.parseDouble(properties.getProperty("employee.salary.max"));
        PASSPORT_SERIES_DIGITS = Integer.parseInt(properties.getProperty("passport.series.digits"));
        PASSPORT_NUMBER_DIGITS = Integer.parseInt(properties.getProperty("passport.number.digits"));
        SALARY_DATE_FORMAT = properties.getProperty("salary.date.format");
        SALARY_EMPLOYEE_COUNT = Integer.parseInt(properties.getProperty("salary.employee.count"));
        SALARY_OUTPUT_FILE = properties.getProperty("salary.output.file");
        CASH_OUTPUT_FILE = properties.getProperty("cash.output.file");
        String[] nominals = properties.getProperty("cash.nominals").split(",");
        Double[] doubles = new Double[nominals.length];
        for (int i = 0; i < nominals.length; i++) {
            doubles[i] = Double.parseDouble(nominals[i]);
        }
        CASH_NOMINALS = doubles;
    }
}
