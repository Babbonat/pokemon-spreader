package com.babbonat.PokemonSpreader.domain;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class AbilityEntity
{
    //First Ability
    private String ab0;
    //Second Ability
    private String ab1;
    //Hidden Ability
    private String abH;
}
