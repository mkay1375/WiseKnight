package ir.mkay.wiseknight;

public class ChessPieceUtils {

    public static void printPossibleMoves(ChessPiece piece) {
        var possibleMoves = piece.getPossibleDestinations();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                var square = new ChessSquare(i, j);
                if (possibleMoves.contains(square)) {
                    System.out.print("X ");
                } else if (piece.getCurrentPosition().equals(square)){
                    System.out.print("O ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
