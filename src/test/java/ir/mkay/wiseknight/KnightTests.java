package ir.mkay.wiseknight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class KnightTests {

    @Test
    public void testPossibleMoves_whenKnightIsAlmostInTheMiddle() {
        var knight = new Knight(new ChessBoard(), ChessSquare.of("d5"));
        ChessPieceUtils.printPossibleMoves(knight);
        var possibleMoves = knight.getPossibleMoves();
        assertEquals(8, possibleMoves.size());
        assertTrue(possibleMoves.contains(ChessSquare.of("c7")));
        assertTrue(possibleMoves.contains(ChessSquare.of("e7")));
        assertTrue(possibleMoves.contains(ChessSquare.of("f6")));
        assertTrue(possibleMoves.contains(ChessSquare.of("f4")));
        assertTrue(possibleMoves.contains(ChessSquare.of("e3")));
        assertTrue(possibleMoves.contains(ChessSquare.of("c3")));
        assertTrue(possibleMoves.contains(ChessSquare.of("b4")));
        assertTrue(possibleMoves.contains(ChessSquare.of("b6")));
    }

    @Test
    public void testPossibleMoves_whenKnightIsInTopLeftCorner() {
        var knight = new Knight(new ChessBoard(), ChessSquare.of("a8"));
        ChessPieceUtils.printPossibleMoves(knight);
        var possibleMoves = knight.getPossibleMoves();
        assertEquals(2, possibleMoves.size());
        assertTrue(possibleMoves.contains(ChessSquare.of("c7")));
        assertTrue(possibleMoves.contains(ChessSquare.of("b6")));
    }


}