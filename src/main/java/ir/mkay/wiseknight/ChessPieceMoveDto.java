package ir.mkay.wiseknight;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ChessPieceMoveDto {

    @Schema(description = "Requires algebraic notation format", example = "a1")
    private String from;
    @Schema(description = "Requires algebraic notation format", example = "h8")
    private String to;

}
