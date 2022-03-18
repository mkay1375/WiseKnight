package ir.mkay.wiseknight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/wise-night")
public class WiseKnightApi {

    private final KnightAdvisor knightAdvisor;

    public WiseKnightApi(@Autowired KnightAdvisor knightAdvisor) {
        this.knightAdvisor = knightAdvisor;
    }

    @PostMapping("/moves")
    public WiseKnightMinimumMovesDto getMinimumMoves(@RequestBody ChessPieceMoveDto moveDto) {
        var lastMove = knightAdvisor.getMinimumMoves(
                new Knight(new ChessBoard(), new ChessSquare(moveDto.getFrom())), new ChessSquare(moveDto.getTo()));
        var moves = new ArrayList<ChessSquare>();
        for (var m = lastMove; m != null; m = m.getPreviousMove()) {
            moves.add(0, m.getDestination());
        }
        return new WiseKnightMinimumMovesDto(moves.size() - 1, moves);
    }

}
