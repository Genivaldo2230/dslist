package com.devesuperior.dslist.services;

import com.devesuperior.dslist.dto.GameListDTO;
import com.devesuperior.dslist.entities.GameList;
import com.devesuperior.dslist.repositorie.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component //registrando componente de componetes no sistemas
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository; //Aqui estamos injetando estancia do gameRepositry sistema

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }

    @Transactional(readOnly = true)
    public GameListDTO findById(Long id) {
        GameList entity = gameListRepository.findById(id).get();
        return new GameListDTO(entity);
    }

}
