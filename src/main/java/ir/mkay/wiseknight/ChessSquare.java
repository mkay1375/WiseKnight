package ir.mkay.wiseknight;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(of = {"row", "column"})
public class ChessSquare {

    private final int row;
    private final int column;
    @JsonIgnore
    private boolean visited = false; // Can be refactored to an attribute map.

    public static ChessSquare of(String stringRepresentation) {
        // Todo: add validation
        return new ChessSquare('8' - stringRepresentation.charAt(1), stringRepresentation.charAt(0) - 'a');
    }

    public ChessSquare(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getWhitesRank() {
        return 8 - row;
    }

    public char getFile() {
        return (char) ('a' + column);
    }

    public boolean isValid() {
        return (0 <= row && row < 8) && (0 <= column && column < 8);
    }

    @Override
    public String toString() {
        return "" + getFile() + getWhitesRank();
    }
}
