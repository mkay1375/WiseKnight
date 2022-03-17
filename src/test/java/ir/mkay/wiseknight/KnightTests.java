package ir.mkay.wiseknight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class KnightTests {

    @Test
    public void testPossibleMoves_whenKnightIsAlmostInTheMiddle() {
        var knight = new Knight(new ChessBoard(), new ChessSquare("d5"));
        ChessPieceUtils.printPossibleMoves(knight);
        var possibleMoves = knight.getPossibleDestinations();
        assertEquals(8, possibleMoves.size());
        assertTrue(possibleMoves.contains(new ChessSquare("c7")));
        assertTrue(possibleMoves.contains(new ChessSquare("e7")));
        assertTrue(possibleMoves.contains(new ChessSquare("f6")));
        assertTrue(possibleMoves.contains(new ChessSquare("f4")));
        assertTrue(possibleMoves.contains(new ChessSquare("e3")));
        assertTrue(possibleMoves.contains(new ChessSquare("c3")));
        assertTrue(possibleMoves.contains(new ChessSquare("b4")));
        assertTrue(possibleMoves.contains(new ChessSquare("b6")));
    }

    @Test
    public void testPossibleMoves_whenKnightIsInTopLeftCorner() {
        var knight = new Knight(new ChessBoard(), new ChessSquare("a8"));
        ChessPieceUtils.printPossibleMoves(knight);
        var possibleMoves = knight.getPossibleDestinations();
        assertEquals(2, possibleMoves.size());
        assertTrue(possibleMoves.contains(new ChessSquare("c7")));
        assertTrue(possibleMoves.contains(new ChessSquare("b6")));
    }


}