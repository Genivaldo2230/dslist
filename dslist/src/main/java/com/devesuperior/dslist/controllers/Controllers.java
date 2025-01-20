package com.devesuperior.dslist.controllers;

import com.devesuperior.dslist.dto.GameMiniDTO;
import com.devesuperior.dslist.services.GameServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class Controllers {

    @Autowired
    private GameServices gameServices;

    @GetMapping
    public List<GameMiniDTO> findAll() {
        List<GameMiniDTO> result = gameServices.findAll();
        return result;

    }


}
