package Lesson_11.example_4;

import java.util.Objects;

public class Passport {
    private String series;
    private String number;

    public Passport(String series, String number) {
        this.series = series;
        this.number = number;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return series.equals(passport.series) && number.equals(passport.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(series, number);
    }
}