package ir.mkay.wiseknight;

public class ChessBoard {

    private final ChessSquare[][] squares;

    public ChessBoard() {
        this.squares = new ChessSquare[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                this.squares[i][j] = new ChessSquare(i, j);
            }
        }
    }

    public ChessSquare getSquare(ChessSquare square) {
        if (!square.isValid()) {
            throw new IllegalArgumentException("Square is not valid: " + square);
        }

        return squares[square.getRow()][square.getColumn()];
    }
}
