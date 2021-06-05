package Lesson_3.example_3;

public class Application {
    public static void main(String[] args) {
        Human Valeriy = new Human("Валерий", 70, null, null);
        Human Alexandra = new Human("Александра", 70, null, null);
        Human Ivan = new Human("Иван", 72, null, null);
        Human Sergey = new Human("Сергей", 50, Valeriy, Alexandra);
        Human Marina = new Human("Марина", 50, Ivan, null);
        Human Elena = new Human("Елена", 30, Sergey, Marina);
        Human[] greatGrandFather = greatGrandParents(Elena.father());
        Human[] greatGrandMather = greatGrandParents(Elena.mother());

        int fal = greatGrandFather.length;
        int sal = greatGrandMather.length;

        Human[] result = new Human[fal + sal];
        System.arraycopy(greatGrandFather, 0, result, 0, fal);
        System.arraycopy(greatGrandMather, 0, result, fal, sal);

        for (Human human : result) {
            if (human != null) {
                System.out.println(human);
            }
        }
    }

    private static Human[] greatGrandParents(Human human) {
        Human grandFather = human.father();
        Human grandMather = human.mother();
        return new Human[]{
                grandMather, grandFather
        };
    }
}
