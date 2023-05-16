package com.babbonat.PokemonSpreader.domain;

public enum TypeEnum
{
    NORMAL ("Normal"),
    FIRE ("Fire"),
    WATER ("Water"),
    GRASS ("Grass"),
    ELECTRIC ("Electric"),
    PSYCHIC ("Psychic"),
    ICE ("Ice"),
    FIGHTING ("Fighting"),
    FLYING ("Flying"),
    POISON ("Poison"),
    GROUND ("Ground"),
    ROCK ("Rock"),
    BUG ("Bug"),
    GHOST ("Ghost"),
    DRAGON ("Dragon"),
    DARK ("Dark"),
    STEEL ("Steel"),
    FAIRY ("Fairy");

    private final String str;

    TypeEnum(String str)
    {
        this.str = str;
    }

    public String getStr()
    {
        return str;
    }
}
