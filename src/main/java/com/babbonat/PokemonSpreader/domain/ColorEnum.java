package com.babbonat.PokemonSpreader.domain;

public enum ColorEnum
{
    RED ("Red"),
    BLUE ("Blue"),
    YELLOW ("Yellow"),
    GREEN ("Green"),
    BLACK ("Black"),
    BROWN ("Brown"),
    PURPLE ("Purple"),
    GRAY ("Gray"),
    WHITE ("White"),
    PINK ("Pink");

    private String str;

    ColorEnum (String str)
    {
        this.str = str;
    }

    public String getStr()
    {
        return str;
    }
}
