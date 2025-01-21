package com.devesuperior.dslist.dto;

import com.devesuperior.dslist.entities.Game;
import com.devesuperior.dslist.entities.GameList;
import org.springframework.beans.BeanUtils;

public class GameListDTO {

    private long id;
    private String name;


public GameListDTO(GameList entity){

    id = entity.getId();
    name = entity.getName();}

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //BeanUtils.copyProperties(entity,this);
    // O método BeanUtils.copyProperties() é bastante utilizado para copiar propriedades de um objeto para outro de forma fácil e rápida, especialmente em situações onde os objetos têm atributos semelhantes.Exemplo: Transferir dados de um DTO para uma entidade de banco de dados.
}
