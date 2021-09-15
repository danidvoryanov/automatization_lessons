package Lesson_7.example_2.Figure;

import Lesson_7.example_2.Chess.Chess;
import Lesson_7.example_2.Chess.Player;
import Lesson_7.example_2.Chess.Position;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Pown extends ChessFigure {

    public Pown(Player player, String position) {
        super(player, position);
        figureType = "Пешка";
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> availableMoves = new HashSet<>();
        Iterator<Position> iterator = Chess.allField().iterator();
        while (iterator.hasNext()) {
            Position candidate = iterator.next();
            int dx = Math.abs(candidate.getHorizontal() - position.getHorizontal());
            int dy = candidate.getVertical() - position.getVertical();
            if (player == Player.WHITE) {
                boolean condition = position.getVertical() == 2
                        ? (dy == 2 || dy == 1) && dx == 0
                        : dy == 1 && dx == 0;
                if (condition)
                    availableMoves.add(candidate);
            }
            if (player == Player.BLACK) {
                boolean condition = position.getVertical() == 7
                        ? (dy == -2 || dy == -1) && dx == 0
                        : dy == -1 && dx ==0;
                if (condition)
                    availableMoves.add(candidate);
            }
        }
        return availableMoves;
    }
}
