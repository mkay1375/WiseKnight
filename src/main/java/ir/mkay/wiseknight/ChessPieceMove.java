package ir.mkay.wiseknight;

import lombok.Getter;

@Getter
public class ChessPieceMove {

    private final ChessSquare destination;
    private final ChessPieceMove previousMove;

    public ChessPieceMove(ChessSquare destination) {
        this.destination = destination;
        this.previousMove = null;
    }

    public ChessPieceMove(ChessSquare destination, ChessPieceMove previousMove) {
        this.destination = destination;
        this.previousMove = previousMove;
    }

    public int getTotalMoves() {
        int i = -1;
        for (var move = this; move != null; move = move.previousMove) {
            i++;
        }
        return i;
    }

    @Override
    public String toString() {
        if (previousMove == null) {
            return "ChessPieceMoves: " + destination.toString();
        } else {
            return previousMove.toString() + " -> " + destination.toString();
        }
    }

}
