package ir.mkay.wiseknight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KnightAdvisorTests {

    @Test
    public void testGetMinimumMoves_whenStartIsA8AndEndIsA8() {
        var moves = getMinimumMoves("a8", "a8");
        System.out.println(moves.toString());
        assertEquals(0, moves.getTotalMoves());
    }

    @Test
    public void testGetMinimumMoves_whenStartIsD5AndEndIsB4() {
        var moves = getMinimumMoves("d5", "b4");
        System.out.println(moves.toString());
        assertEquals(1, moves.getTotalMoves());
    }

    @Test
    public void testGetMinimumMoves_whenStartIsD5AndEndIsE4() {
        var moves = getMinimumMoves("d5", "e4");
        System.out.println(moves.toString());
        assertEquals(2, moves.getTotalMoves());
    }

    @Test
    public void testGetMinimumMoves_whenStartIsA8AndEndIsB7() {
        var moves = getMinimumMoves("a8", "b7");
        System.out.println(moves.toString());
        assertEquals(4, moves.getTotalMoves());
    }

    @Test
    public void testGetMinimumMoves_whenStartIsA1AndEndIsA8() {
        var moves = getMinimumMoves("a1", "a8");
        System.out.println(moves.toString());
        assertEquals(5, moves.getTotalMoves());
    }

    @Test
    public void testGetMinimumMoves_whenStartIsH1AndEndIsH8() {
        var moves = getMinimumMoves("h1", "h8");
        System.out.println(moves.toString());
        assertEquals(5, moves.getTotalMoves());
    }

    @Test
    public void testGetMinimumMoves_whenStartIsH1AndEndIsA1() {
        var moves = getMinimumMoves("h1", "a1");
        System.out.println(moves.toString());
        assertEquals(5, moves.getTotalMoves());
    }

    @Test
    public void testGetMinimumMoves_whenStartIsH1AndEndIsG1() {
        var moves = getMinimumMoves("h1", "g1");
        System.out.println(moves.toString());
        assertEquals(3, moves.getTotalMoves());
    }

    @Test
    public void testGetMinimumMoves_whenStartIsD1AndEndIsE1() {
        var moves = getMinimumMoves("d1", "e1");
        System.out.println(moves.toString());
        assertEquals(3, moves.getTotalMoves());
    }

    @Test
    public void testGetMinimumMoves_whenStartIsD4AndEndIsE4() {
        var moves = getMinimumMoves("d4", "e4");
        System.out.println(moves.toString());
        assertEquals(3, moves.getTotalMoves());
    }

    private ChessPieceMove getMinimumMoves(String start, String end) {
        return new KnightAdvisor()
                .getMinimumMoves(new Knight(new ChessBoard(), new ChessSquare(start)), new ChessSquare(end));
    }

}