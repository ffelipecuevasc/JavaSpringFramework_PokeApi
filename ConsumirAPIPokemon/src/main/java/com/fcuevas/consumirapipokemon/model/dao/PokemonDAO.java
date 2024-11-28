package com.fcuevas.consumirapipokemon.model.dao;

import com.fcuevas.consumirapipokemon.model.dto.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PokemonDAO {

    @Autowired
    private RestTemplate restTemplate;

    private final String apiUrlBase = "https://pokeapi.co/api/v2/pokemon/";

    public List<Pokemon> getPokemons(){
        List<Pokemon> listPokemons = new ArrayList<>();

        for(int i = 1; i <= 12; i++){
            String urlApi = apiUrlBase + i;
            ResponseEntity<Pokemon> response = restTemplate.exchange(
                    urlApi,
                    HttpMethod.GET,
                    null,
                    Pokemon.class
            );
            listPokemons.add(response.getBody());
        }
        return listPokemons;
    }
}
