package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pokemon> pokemonListOfAsh = initializePokemons();

        // Every pokemon has a name and a type.
        // Certain types are effective against others, e.g. water is effective against fire.

        // Ash has a few pokemon.
        // A wild pokemon appeared!

        Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

        String choosepokemon = "";
        for (Pokemon pokemon : pokemonListOfAsh) {
            if (pokemon.isEffectiveAgainst(wildPokemon)) {
                choosepokemon = pokemon.name;
            }

        }
        // Which pokemon should Ash use?
        // Write the necessary code to get the name of the right pokemon and print it:
        System.out.print("I choose you, " + choosepokemon);


    }


        private static List<Pokemon> initializePokemons () {
            List<Pokemon> pokemon = new ArrayList<>();

            pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
            pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
            pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
            pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
            pokemon.add(new Pokemon("Kingler", "water", "fire"));

            return pokemon;
        }


    }

