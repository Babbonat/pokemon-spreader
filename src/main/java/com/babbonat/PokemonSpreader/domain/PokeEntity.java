package com.babbonat.PokemonSpreader.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pokemon")
public class PokeEntity
{
    @Id
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "type1")
    private String type1;
    @Column(name = "type2")
    private String type2;
    private StatsEntity baseStats;
    private AbilityEntity abilities;
    @Column(name = "height")
    private double height;
    @Column(name = "weight")
    private double weight;
    @Column(name = "color")
    private String color;
    @Column(name = "form")
    private String form;
}
