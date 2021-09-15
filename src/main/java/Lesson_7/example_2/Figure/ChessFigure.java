package Lesson_7.example_2.Figure;

import Lesson_7.example_2.Chess.Player;
import Lesson_7.example_2.Chess.Position;

import java.util.Set;

public class ChessFigure {
    protected String figureType = "Шахматная фигура";
    protected Player player;
    protected Position position;

    public String getFigureType() {
        return figureType;
    }

    public ChessFigure(Player player, String position) {
        this.player = player;
        this.position = new Position(position);
    }

    public Set<Position> getAvailableMoves() {
        throw new IllegalStateException("Для данного типа определить возможные ходы невозможно");
    }

    public String getPosition() {
        return position.getPosition();
    }
}
