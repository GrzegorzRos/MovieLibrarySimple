import models.Actor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ActorTest {

//    @Test
//    void shouldCalculateCorrectSalary(){
//        Actor actor = new Actor("Name", "Family name");
//        int expectSalary = 30000;
//        int actual = actor.calculateSalary(3,10000);
//
//        assertThat(expectSalary).isEqualTo(actual);
//        System.out.println("Salary was calculated CORRECTLY");
//    }

    @DisplayName("Calculate Salary for actor")
    @ParameterizedTest(name = "Movies={0} and rate = {1}")
    @CsvSource({"10, 500, 5000", "20, 4, 80", "1, 44, 44"})
    void shouldCalculateCorrectSalary(int movie, int rate, int expected){
        Actor actor = new Actor("Name", "Family name");
        int actual = actor.calculateSalary(movie,rate);

        assertThat(actual).isEqualTo(expected);
        System.out.println("Salary was calculated CORRECTLY");
    }

    @DisplayName("Print toString")
    @ParameterizedTest(name = "Name={0} Famili name = {1}, rank ={2}, oscar = {3}")
    @CsvSource({"Tom, Hanks, 2, true", "Morgan, Freeman, 1, true", "Brat, Pitt, 15, false"})
    void shouldPrintData(String firstName, String secondName, int rank, boolean isOscar){
        Actor actor = new Actor(firstName, secondName, rank, isOscar);
        String actual = actor.toString();
        String expected;
        if (isOscar) {
            expected = firstName + " " + secondName + " ma pozycję: " + rank +" w rankingu aktorów. Ma na koncie Oskara";
        } else {expected = firstName + " " + secondName + " ma pozycję: " + rank +" w rankingu aktorów. Nie ma na koncie Oskara";}

        assertThat(actual).isEqualTo(expected);
        System.out.println("Salary was calculated CORRECTLY");
    }
}
