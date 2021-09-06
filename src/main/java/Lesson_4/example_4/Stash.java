package Lesson_4.example_4;

public class Stash {
    private static final Passport[] AL_PASSPORTS = new Passport[100];
    private static int index = 0;

    public static boolean isPassportExists(String series, String number) {
        for (Passport passport : AL_PASSPORTS) {
            if (passport == null) {
                break;
            }
            String currentSeries = passport.getSeries();
            String currentNumber = passport.getNumber();

            if (currentNumber == null || currentSeries == null) {
                continue;
            }
            if (currentSeries.equals(series) && currentNumber.equals(number)) {
                System.out.printf("Ошибка: Паспорт с серией %s и номером %s уже существует%n", series, number);
                return true;
            }
        }
        return false;
    }

    public static void addPassport(Passport passport) {
        AL_PASSPORTS[index++] = passport;
    }

}
