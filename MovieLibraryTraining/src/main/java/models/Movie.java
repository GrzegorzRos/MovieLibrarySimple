package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
