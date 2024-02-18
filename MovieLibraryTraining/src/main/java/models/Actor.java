package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Actor {

//    pola
    private String firstName;
    private String secondName;
    private int rating;
    private boolean isOscarPrized;

//    konstruktory

    public Actor(String firstName, String secondName, int rating, boolean isOscarPrized) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.rating = rating;
        this.isOscarPrized = isOscarPrized;
    }

    public Actor(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Actor() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isOscarPrized() {
        return isOscarPrized;
    }

    public void setOscarPrized(boolean oscarPrized) {
        isOscarPrized = oscarPrized;
    }

    public int calculateSalary(int movies, int rate) {
        if (rating <20) {
            return movies*rate + 150000;
        } else if ( rating < 40) {
            return movies*rate + 50000;
        }
        return movies*rate;
    }

    @Override
    public String toString(){
        String oscar;
        if (isOscarPrized) {
            oscar = " Ma na koncie Oskara";
        } else {oscar = " Nie ma na koncie Oskara";}
        return firstName + " " + secondName + " ma pozycję: " + rating + " w rankingu aktorów." + oscar;
    }
}
