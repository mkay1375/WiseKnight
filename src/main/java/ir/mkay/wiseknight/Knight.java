package ir.mkay.wiseknight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Knight implements ChessPiece {

    private final ChessBoard board;
    private ChessSquare currentPosition;

    public Knight(ChessBoard board, ChessSquare currentPosition) {
        this.board = board;
        this.currentPosition = board.getSquare(currentPosition);
    }

    @Override
    public void move(ChessSquare square) {
        this.currentPosition = board.getSquare(square);
    }

    @Override
    public ChessSquare getCurrentPosition() {
        return currentPosition;
    }

    @Override
    public List<ChessSquare> getPossibleMoves() {
        return getAllMoves().stream()
                .filter(ChessSquare::isValid)
                .map(board::getSquare)
                .collect(Collectors.toList());
    }

    private List<ChessSquare> getAllMoves() {
        var moves = new ArrayList<ChessSquare>(8);
        moves.add(new ChessSquare(currentPosition.getRow() - 2, currentPosition.getColumn() - 1));
        moves.add(new ChessSquare(currentPosition.getRow() - 2, currentPosition.getColumn() + 1));
        moves.add(new ChessSquare(currentPosition.getRow() - 1, currentPosition.getColumn() + 2));
        moves.add(new ChessSquare(currentPosition.getRow() + 1, currentPosition.getColumn() + 2));
        moves.add(new ChessSquare(currentPosition.getRow() + 2, currentPosition.getColumn() + 1));
        moves.add(new ChessSquare(currentPosition.getRow() + 2, currentPosition.getColumn() - 1));
        moves.add(new ChessSquare(currentPosition.getRow() + 1, currentPosition.getColumn() - 2));
        moves.add(new ChessSquare(currentPosition.getRow() - 1, currentPosition.getColumn() - 2));
        return moves;
    }
}
