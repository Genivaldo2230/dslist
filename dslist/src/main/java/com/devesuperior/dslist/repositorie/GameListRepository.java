package com.devesuperior.dslist.repositorie;

import com.devesuperior.dslist.entities.Game;
import com.devesuperior.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,  Long> {


}
