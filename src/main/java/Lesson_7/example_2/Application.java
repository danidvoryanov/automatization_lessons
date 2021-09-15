package Lesson_7.example_2;

import Lesson_7.example_2.Chess.Player;
import Lesson_7.example_2.Chess.Position;
import Lesson_7.example_2.Figure.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        List<ChessFigure> figures = new ArrayList<>();
        figures.add(new King(Player.WHITE, "C2"));
        figures.add(new Queen(Player.WHITE, "B1"));
        figures.add(new Rook(Player.WHITE, "G5"));
        figures.add(new Knight(Player.WHITE, "A5"));
        figures.add(new Bishop(Player.WHITE, "H3"));
        figures.add(new Pown(Player.BLACK, "F8"));

        for (ChessFigure figure : figures)
            printMoves(figure);

    }

    private static void printMoves(ChessFigure figure) {
        Set<Position> positions = figure.getAvailableMoves();
        StringBuilder sb = new StringBuilder(figure.getFigureType())
                .append(" (").append(figure.getPosition()).append("):");
        Iterator<Position> iterator = positions.iterator();
        while (iterator.hasNext()) {
            Position position = iterator.next();
            sb.append(", ").append(position.getPosition());
        }
        System.out.println(sb.toString().replaceFirst(",", ""));
    }

}
