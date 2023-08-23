package dag1.dat22be23uge1dag1demo2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Lombok ting til at lave getter, setter og no arg constructor på en smart måde
@Getter
@Setter
@NoArgsConstructor


//Entity annotation. Noget med databasen
@Entity
@Table (name = "spiller")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column (name = "player name", length = 70, nullable = false)
    String name;
    String country;
    String position;

    public Player(String name, String country, String position) {
        this.name = name;
        this.country = country;
        this.position = position;
    }

}

