package Lesson_11.example_4;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileHelper {

    public static List<Person> getPersonsFromExcel(String path, String sheetName) {
        Workbook workbook = openExcelFile(path);
        Sheet sheet = openSomeExcelSheet(workbook, sheetName);
        List<Row> rows = getListRows(sheet);

        return convertRowsToPersons(rows);
    }

    private static Workbook openExcelFile(String path) {
        try (FileInputStream file = new FileInputStream(new File(path))) {
            Workbook workBook = new XSSFWorkbook(file);
            return workBook;
        } catch (IOException e) {
            throw new RuntimeException("File not found. Please try again");
        }
    }

    private static Sheet openSomeExcelSheet(Workbook workbook, String sheetName) {
        return workbook.getSheet(sheetName);
    }

    private static List<Row> getListRows(Sheet sheet) {
        List<Row> rows = new ArrayList<>();

        for (Row row : sheet) {
            rows.add(row);
        }
        return rows;
    }

    private static List<Person> convertRowsToPersons(List<Row> rows) {
        List<Person> persons = new ArrayList<>();

        for (Row row : rows) {
            Person person = convertRowToPerson(row);
            persons.add(person);
        }
        return persons;
    }

    private static Person convertRowToPerson(Row row) {
        String secondName = row.getCell(1).getStringCellValue();
        String firstName = row.getCell(0).getStringCellValue();
        String patronymic = row.getCell(2).getStringCellValue();

        String birthDateAsString = row.getCell(3).getStringCellValue();

        Date birthDate = null;
        try {
            birthDate = new SimpleDateFormat("dd.MM.yyyy").parse(birthDateAsString);
        } catch (ParseException e) {
            throw new RuntimeException("Incorrect date.");
        }

        String series = row.getCell(4).getStringCellValue();
        String number = row.getCell(5).getStringCellValue();

        Passport passport = new Passport(series, number);

        return new Person(firstName, secondName, patronymic, birthDate,  passport);
    }
}