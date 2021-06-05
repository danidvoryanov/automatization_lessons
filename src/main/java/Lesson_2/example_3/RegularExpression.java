package Lesson_2.example_3;

public class RegularExpression {
    static boolean validatenumber(String mobilenumder) {
        if (mobilenumder.length() != 16) {
            return false;
        }
        if (!mobilenumder.startsWith("+7(")) {
            return false;
        }
        if (mobilenumder.charAt(6) != ')') {
            return false;
        }
        if (mobilenumder.charAt(10) != '-') {
            return false;
        }
        if (mobilenumder.charAt(13) != '-') {
            return false;
        }
        int[] digit = {3, 4, 5, 7, 8, 9, 11, 12, 14, 15};
        String number = "0123456789";
        for (int index : digit) {
            String ind = String.valueOf(mobilenumder.charAt(index));
            if (!number.contains(ind)) {
                return false;
            }
        }
        return true;
    }

    public boolean regular(String mobilenumber) {
        return mobilenumber.matches("^\\+7\\(\\d{3}\\)\\d{3}\\-\\d{2}\\-\\d{2}$");
    }

    public static void main(String[] args) {
        RegularExpression numbercheck = new RegularExpression();
        System.out.println(numbercheck.validatenumber("+7(910)423-73-12"));
        System.out.println(numbercheck.validatenumber("7(910)423-73-12"));
        System.out.println(numbercheck.validatenumber("89215310934"));
        System.out.println(numbercheck.validatenumber("+5(911)310-12-74"));

        System.out.println(numbercheck.regular("+7(910)423-73-12"));
        System.out.println(numbercheck.regular("7(910)423-73-12"));
        System.out.println(numbercheck.regular("89215310934"));
        System.out.println(numbercheck.regular("+5(911)310-12-74"));

    }
}