package com.babbonat.PokemonSpreader.services;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;


public class ShowdownImporter
{
    private static final String requestURL = "https://play.pokemonshowdown.com/data/pokedex.json";

    public static String getJSON()
    {
        String json = null;
        try {
            URL url = new URL(requestURL);
            InputStream inputStream = url.openStream();
            InputStreamReader isr = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(isr);
            StringBuilder builder = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                builder.append((char) c);
            }
            json = builder.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }
}
