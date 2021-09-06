package Lesson_4.example_4;

public class Passport {
    private String series;
    private String number;

    public Passport() {
        Stash.addPassport(this);
    }

    public String getNumber() {
        return number;
    }

    public String getSeries() {
        return series;
    }

    public Passport setSeries(String series) {
        if (Stash.isPassportExists(series, number)) {
            return this;
        }
        if (series.matches("^(\\d{4})$")) {
            System.out.printf("Устанавливаем серию паспорта %s%n", series);
            this.series = series;
        } else {
            System.out.printf("Серия паспорта не установлена %s%n", series);
        }
        return this;
    }

    public Passport setNumber(String number) {
        if (Stash.isPassportExists(series, number))
            return this;
        if (number.matches("^(\\d{6})$")) {
            System.out.printf("Устанавливаем номер паспорта %s%n", number);
            this.number = number;
        } else System.out.printf("Номер паспорта не установлен %s%n", number);
        return this;
    }
}
