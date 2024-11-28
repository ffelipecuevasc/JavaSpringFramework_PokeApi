package com.fcuevas.consumirapipokemon.service;

import com.fcuevas.consumirapipokemon.model.dao.PokemonDAO;
import com.fcuevas.consumirapipokemon.model.dto.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonService {

    @Autowired
    private PokemonDAO pokemonDAO;

    public List<Pokemon> getPokemons() {
        return pokemonDAO.getPokemons();
    }
}
