package com.devesuperior.dslist.services;

import com.devesuperior.dslist.dto.GameDTO;
import com.devesuperior.dslist.dto.GameListDTO;
import com.devesuperior.dslist.dto.GameMiniDTO;
import com.devesuperior.dslist.entities.Game;
import com.devesuperior.dslist.entities.GameList;
import com.devesuperior.dslist.repositorie.GameListRepository;
import com.devesuperior.dslist.repositorie.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component //registrando componente de componetes no sistemas
public class GameListServices {

//    @Transactional(readOnly = true)
//    public GameDTO findById(Long id){
//        Game result = gameRepository.findById(id).get();
//        GameDTO dto = new GameDTO(result);
//
//        return dto;
//    }

    @Autowired
    private GameListRepository gameListRepository; //Aqui estamos injetando estancia do gameRepositry sistema

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }

}
