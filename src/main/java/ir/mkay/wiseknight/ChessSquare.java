package ir.mkay.wiseknight;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = {"row", "column"})
public class ChessSquare {

    private final int row;
    private final int column;
    @JsonIgnore
    private boolean visited = false; // Can be refactored to an attribute map.

    public ChessSquare(String algebraicNotation) {
        // Todo: add validation
        this('8' - algebraicNotation.charAt(1), algebraicNotation.charAt(0) - 'a');
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

    @JsonIgnore
    public boolean isValid() {
        return (0 <= row && row < 8) && (0 <= column && column < 8);
    }

    @Override
    @JsonProperty("an")
    public String toString() {
        return "" + getFile() + getWhitesRank();
    }
}
