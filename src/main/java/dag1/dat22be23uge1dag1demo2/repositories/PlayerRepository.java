package dag1.dat22be23uge1dag1demo2.repositories;

import dag1.dat22be23uge1dag1demo2.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Integer> {

    Player findByName(String player);

}
