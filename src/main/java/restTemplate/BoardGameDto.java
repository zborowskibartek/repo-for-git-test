package restTemplate;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
public class BoardGameDto {

    private long boardGameId;
    private String name;
    private double pricePerDay;
    private boolean rented;
    private BoardGameCondition condition;
    private BoardGameDetails details;

}
