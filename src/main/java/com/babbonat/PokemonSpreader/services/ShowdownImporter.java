package com.babbonat.PokemonSpreader.services;
import com.babbonat.PokemonSpreader.domain.AbilityEntity;
import com.babbonat.PokemonSpreader.domain.PokeEntity;
import com.babbonat.PokemonSpreader.domain.StatsEntity;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.swing.*;
import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class ShowdownImporter
{
    private static final String requestURL = "https://play.pokemonshowdown.com/data/pokedex.json";

    private static String getStr()
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

    private static PokeEntity setEntity(Map.Entry<String, JsonNode> node)
    {
        PokeEntity p = new PokeEntity();
        StatsEntity s = new StatsEntity();
        AbilityEntity a = new AbilityEntity();
        p.setId(node.getValue().get("num").asInt());
        p.setName(node.getValue().get("name").asText());
        p.setType1(node.getValue().get("types").get(0).asText());
        if(node.getValue().get("types").get(1)!=null)
            p.setType2(node.getValue().get("types").get(1).asText());
        s.setHp(node.getValue().get("baseStats").get("hp").asInt());
        s.setAtk(node.getValue().get("baseStats").get("atk").asInt());
        s.setDef(node.getValue().get("baseStats").get("def").asInt());
        s.setSpa(node.getValue().get("baseStats").get("spa").asInt());
        s.setSpd(node.getValue().get("baseStats").get("spd").asInt());
        s.setSpe(node.getValue().get("baseStats").get("spe").asInt());
        a.setAb0(node.getValue().get("abilities").get("0").asText());
        if(node.getValue().get("abilities").get("1")!=null)
            a.setAb1(node.getValue().get("abilities").get("1").asText());
        if(node.getValue().get("abilities").get("H")!=null)
            a.setAbH(node.getValue().get("abilities").get("H").asText());
        p.setAbilities(a);
        p.setBaseStats(s);
        p.setHeight(node.getValue().get("heightm").asDouble());
        p.setWeight(node.getValue().get("weightkg").asDouble());
        p.setColor(node.getValue().get("color").asText());
        if(node.getValue().get("forme")!=null)
            p.setForm(node.getValue().get("forme").asText());
        return p;
    }

    public static Map<Integer, PokeEntity> getJSON()
    {
        Map<Integer, PokeEntity> m = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        File f = new File(requestURL);
        String str = getStr();
        try{
            JsonNode list = mapper.readTree(str);
            Iterator<Map.Entry<String, JsonNode>> it = list.fields();
            while(it.hasNext())
            {
                Map.Entry<String, JsonNode> entry = it.next();
                PokeEntity p = setEntity(entry);
                m.put(p.getId(), p);
                //System.out.println(p.toString());
            }
        } catch (IOException e){e.printStackTrace();}
        return m;
    }
}
