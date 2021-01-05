package restTemplate;


import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class RestTempClass {

    public final static String URL = "http://localhost:8080/boardgames";

    public static void main(String[] args) throws URISyntaxException {

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(URL, String.class);
        String result2 = restTemplate.getForObject("http://localhost:8080/boardgames/{index}", String.class, "1");
        String result3 = restTemplate.getForObject("http://localhost:8080/{domain}/{index}", String.class, "boardgames", "1");
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("domain", "boardgames");
        uriVariables.put("index", "1");
        BoardGameDto result4 = restTemplate.getForObject("http://localhost:8080/{domain}/{index}", BoardGameDto.class, uriVariables);
        BoardGamesResponse result5 = restTemplate.getForObject("http://localhost:8080/{domain}", BoardGamesResponse.class, uriVariables);

        URI uri = new URI("https://localhost:8080/boardgames/2");

       restTemplate.delete(uri);

        String result6 = restTemplate.getForObject("http://localhost:8080/boardgames", String.class);

        System.out.println(result6);



/*
        System.out.println(result);
        System.out.println(result4.getBoardGameId());
        System.out.println(result4.hashCode());
        System.out.println(result4.getClass());
*/
        System.out.println(result5);


        //System.out.println(result4);
        /*System.out.println();
        System.out.println(result2);
        System.out.println();
        System.out.println(result3);
        System.out.println();
        System.out.println(result4);*/


    }


}
