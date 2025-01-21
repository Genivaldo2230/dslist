package com.devesuperior.dslist.controllers;

import com.devesuperior.dslist.dto.GameDTO;
import com.devesuperior.dslist.dto.GameListDTO;
import com.devesuperior.dslist.dto.GameMiniDTO;
import com.devesuperior.dslist.services.GameListServices;
import com.devesuperior.dslist.services.GameServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/list")
public class GameListControllers {

    @Autowired
    private GameListServices gameListServices;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListServices.findAll();
        return result;

    }




}
