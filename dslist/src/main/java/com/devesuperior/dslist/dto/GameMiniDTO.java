package com.devesuperior.dslist.dto;

import com.devesuperior.dslist.entities.Game;
import jakarta.persistence.Column;

public class GameMiniDTO {

    private long id;
    private String title;
    private int year;
    private String imgUrl;
    private String shortDescription;

    public GameMiniDTO(){

    }
    //nesse modelo vamos usar a Entity pra receber a chamada dos dados dentro da Dto
    public GameMiniDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
