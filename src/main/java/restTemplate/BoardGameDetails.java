package restTemplate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BoardGameDetails {

    private String description;
    private int minPlayers;
    private int maxPlayers;
    private String author;
    private String publisher;
    private List<BoardGameType> types;
    private List<BoardGameCategory> categories;

}
