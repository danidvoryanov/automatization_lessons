package lessons.lesson1.example1;

class example1 {

    int radius1;
    int radius2;
    int radius3;

    double getarea1() {
        return 3.14 * (Math.pow(radius1, 2));
    }
        double getarea2 () {
            return 3.14 * (Math.pow(radius2, 2));
        }
            double getarea3 () {
                return 3.14 * (Math.pow(radius3, 2));
            }

    public static void main(String[] args) {

        lessons.lesson1.example1.example1 radius = new lessons.lesson1.example1.example1();
        radius.radius1 = 0;
        radius.radius2 = 2;
        radius.radius3 = 100;

        System.out.println(radius.getarea1());
        System.out.println(radius.getarea2());
        System.out.println(radius.getarea3());
    }
}

