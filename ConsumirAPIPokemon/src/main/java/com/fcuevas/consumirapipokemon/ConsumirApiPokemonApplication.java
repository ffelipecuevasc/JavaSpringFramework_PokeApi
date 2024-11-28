package com.fcuevas.consumirapipokemon;

import com.fcuevas.consumirapipokemon.model.dto.Pokemon;
import com.fcuevas.consumirapipokemon.service.PokemonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class ConsumirApiPokemonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumirApiPokemonApplication.class, args);
    }

}
