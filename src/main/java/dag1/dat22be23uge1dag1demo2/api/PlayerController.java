package dag1.dat22be23uge1dag1demo2.api;

import dag1.dat22be23uge1dag1demo2.entity.Player;
import dag1.dat22be23uge1dag1demo2.repositories.PlayerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//RestControlller
@RequestMapping("/api/players")
public class PlayerController {

    PlayerRepository playerRepository;

    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @GetMapping
    List<Player> getPlayers() {
        return  playerRepository.findAll();
    }
}
