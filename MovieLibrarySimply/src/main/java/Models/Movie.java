package Models;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    private String title;
    private int rating;
    private List<Actor> actors;

    public Movie(String title){
        this.title=title;
    }

}
