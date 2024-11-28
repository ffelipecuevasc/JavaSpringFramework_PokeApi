package com.fcuevas.consumirapipokemon.model.dto;

import java.util.List;
import java.util.stream.Collectors;

public class Pokemon {

    private Integer id;
    private String name;
    private Integer base_experience;
    private List<Ability> abilities;
    private List<Type> types;
    private Sprites sprites;

    public Pokemon(Integer id, String name, Integer base_experience, List<Ability> abilities, List<Type> types, Sprites sprites) {
        this.id = id;
        this.name = name;
        this.base_experience = base_experience;
        this.abilities = abilities;
        this.types = types;
        this.sprites = sprites;
    }

    public Pokemon() {
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(Integer base_experience) {
        this.base_experience = base_experience;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public String getAbilitiesNames(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < abilities.size(); i++){
            if(i > 0){
                sb.append(" | ");
            }
            sb.append(abilities.get(i).getAbility().getName());
        }
        return sb.toString();
    }

    public String getTypesNames(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < types.size(); i++){
            if(i > 0){
                sb.append(" | ");
            }
            sb.append(types.get(i).getType().getName());
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pokemon ID: ").append(id).append("\n");
        sb.append("Nombre: ").append(name).append("\n");
        sb.append("Experiencia Base: ").append(base_experience).append("\n");
        sb.append("Habilidades: ").append(abilities.stream().map(a -> a.getAbility().getName()).collect(Collectors.joining(", "))).append("\n");
        sb.append("Tipo: ").append(types.stream().map(t -> t.getType().getName()).collect(Collectors.joining(", "))).append("\n");
        return sb.toString();
    }
}
