package ir.mkay.wiseknight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WiseKnightMinimumMovesDto {

    private int movesCount;
    private List<ChessSquare> steps;

}
