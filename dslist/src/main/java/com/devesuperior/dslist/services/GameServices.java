package com.devesuperior.dslist.services;

import com.devesuperior.dslist.dto.GameDTO;
import com.devesuperior.dslist.dto.GameMinDTO;
import com.devesuperior.dslist.entities.Game;
import com.devesuperior.dslist.projection.GameMinProjection;
import com.devesuperior.dslist.repositorie.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service //registrando componente de componetes no sistemas
public class GameServices {

    @Transactional(readOnly = true)
    public GameDTO findById(@PathVariable Long id){
        Game result = gameRepository.findById(id).get();
        return  new GameDTO(result);

    }

    @Autowired
    private GameRepository gameRepository; //Aqui estamos injetando estancia do gameRepositry sistema



    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }

}
