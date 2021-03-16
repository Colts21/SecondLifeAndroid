package com.example.secondlife.model;

import java.time.LocalDateTime;

// Game : data model for the app
// GameDatabase : model from the database
// GameApi : model from the api

public class Game {

    private int id;
    private String name;
    private String description;
    private LocalDateTime addedDate;

    public Game(int id, String name, String description, LocalDateTime addedDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.addedDate = addedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(LocalDateTime addedDate) {
        this.addedDate = addedDate;
    }
}
