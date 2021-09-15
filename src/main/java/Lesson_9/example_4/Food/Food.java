package Lesson_9.example_4.Food;

public abstract class Food {
    int cookingTime;

    public Food(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public int getCookingTime() {
        return cookingTime;
    }
}
