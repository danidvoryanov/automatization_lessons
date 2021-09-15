package Lesson_8.example_3;

public class QiwiTerminal extends Terminal {
    public QiwiTerminal(String address) {
        super(address);
        owner = Owner.QIWI;
        tax = 7;
        noTaxLimit = 1000;
    }
}