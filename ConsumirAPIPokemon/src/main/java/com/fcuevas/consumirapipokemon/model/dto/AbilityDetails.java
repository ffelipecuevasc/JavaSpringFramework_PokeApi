package com.fcuevas.consumirapipokemon.model.dto;

public class AbilityDetails {

    private String name;

    public AbilityDetails(String name) {
        this.name = name;
    }

    public AbilityDetails() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
