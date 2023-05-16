package com.babbonat.PokemonSpreader.domain;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class StatsEntity
{
    private short hp;
    private short atk;
    private short def;
    private short spa;
    private short spd;
    private short spe;
}
