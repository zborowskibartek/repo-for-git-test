package restTemplate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class BoardGamesResponse {

    private List<BoardGameDto> boardGames;
    private int totalCount;


}
