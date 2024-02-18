package Models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Actor {

    private String name;
    private String familyName;
    private int rank;
    private boolean isOscarPrized;

}
