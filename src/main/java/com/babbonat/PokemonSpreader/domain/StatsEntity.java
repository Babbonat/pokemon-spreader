package com.babbonat.PokemonSpreader.domain;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class StatsEntity
{
    private int hp;
    private int atk;
    private int def;
    private int spa;
    private int spd;
    private int spe;
}
