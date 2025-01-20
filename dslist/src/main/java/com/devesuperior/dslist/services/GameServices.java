package com.devesuperior.dslist.services;

import com.devesuperior.dslist.dto.GameMiniDTO;
import com.devesuperior.dslist.entities.Game;
import com.devesuperior.dslist.repositorie.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component //registrando componente de componetes no sistemas
public class GameServices {

    @Autowired
    private GameRepository gameRepository; //Aqui estamos injetando estancia do gameRepositry sistema


    public List<GameMiniDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMiniDTO> dto = result.stream().map(x -> new GameMiniDTO(x)).toList();
        return dto;
    }

}
