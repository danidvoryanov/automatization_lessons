package Lesson_9.example_2;

public class Action {

    public static void doAction(Object object) {
        if (object instanceof Drawable) {
            Drawable drawable = (Drawable) object;
            drawable.draw();
        }
        if (object instanceof Movable) {
            Movable movable = (Movable) object;
            movable.move();
        }
    }

}
