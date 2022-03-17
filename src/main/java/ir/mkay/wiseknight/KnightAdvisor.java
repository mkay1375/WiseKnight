package ir.mkay.wiseknight;

import java.util.ArrayList;

public class KnightAdvisor {

    public ChessPieceMove getMinimumMoves(Knight knight, ChessSquare destination) {
        if (knight.getCurrentPosition().equals(destination)) {
            return new ChessPieceMove(destination);
        }

        var possibleMoves = knight.getPossibleMoves().stream()
                .map(s -> new ChessPieceMove(s, new ChessPieceMove(knight.getCurrentPosition())))
                .toList();

        while (possibleMoves.size() > 0) {
            for (var move : possibleMoves) {
                if (move.getDestination().equals(destination)) {
                    return move;
                }
            }

            knight.getCurrentPosition().setVisited(true);

            var nextPossibleMoves = new ArrayList<ChessPieceMove>();
            for (var move : possibleMoves) {
                if (!move.getDestination().isVisited()) {
                    knight.move(move.getDestination());
                    move.getDestination().setVisited(true);
                    for (var square : knight.getPossibleMoves()) {
                        nextPossibleMoves.add(new ChessPieceMove(square, move));
                    }
                }
            }
            possibleMoves = nextPossibleMoves;
        }

        return null;
    }

}
