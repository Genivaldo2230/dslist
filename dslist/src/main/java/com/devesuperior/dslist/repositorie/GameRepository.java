package com.devesuperior.dslist.repositorie;

import com.devesuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,  Long> {


}
