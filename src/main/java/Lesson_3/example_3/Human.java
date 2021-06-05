package Lesson_3.example_3;

public class Human {
    String name;
    Human father;
    Human mother;

    public Human(String name, int age, Human father, Human mother) {
        this.name = name;
        this.father = father;
        this.mother = mother;
    }
    public Human father() {
        return father;
    }

    public Human mother() {
        return mother;
    }

    public String toString() {
        return name;
    }
}
