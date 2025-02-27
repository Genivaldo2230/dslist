package com.devesuperior.dslist.dto;

import com.devesuperior.dslist.entities.Game;
import com.devesuperior.dslist.projection.GameMinProjection;

public class GameMinDTO {

    private long id;
    private String title;
    private int year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){

    }
    //nesse modelo vamos usar a Entity pra receber a chamada dos dados dentro da Dto
    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
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
