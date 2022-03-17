package ir.mkay.wiseknight;

import java.util.List;

public interface ChessPiece {

    void move(ChessSquare square);
    ChessSquare getCurrentPosition();
    List<ChessSquare> getPossibleMoves();

}
