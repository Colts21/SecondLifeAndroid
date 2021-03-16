package com.example.secondlife.model;

import java.time.LocalDateTime;
import java.util.List;

public class User {

    private int id;
    private String name;
    private LocalDateTime birthDate;
    private List<Game> games;

    public User(int id, String name, LocalDateTime birthDate, List<Game> games) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.games = games;
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

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
