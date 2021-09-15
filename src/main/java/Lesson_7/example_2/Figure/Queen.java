package Lesson_7.example_2.Figure;

import Lesson_7.example_2.Chess.Chess;
import Lesson_7.example_2.Chess.Player;
import Lesson_7.example_2.Chess.Position;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Queen extends ChessFigure {

    public Queen(Player player, String position) {
        super(player, position);
        figureType = "Ферзь";
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> availableMoves = new HashSet<>();
        Iterator<Position> iterator = Chess.allField().iterator();
        while (iterator.hasNext()) {
            Position candidate = iterator.next();
            int dx = Math.abs(candidate.getHorizontal() - position.getHorizontal());
            int dy = Math.abs(candidate.getVertical() - position.getVertical());
            if (dx == 0 && dy == 0) continue;
            if (dx == 0 || dy == 0 || dx == dy)
                availableMoves.add(candidate);
        }
        return availableMoves;
    }
}
