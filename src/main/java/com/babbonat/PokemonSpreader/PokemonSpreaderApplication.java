package com.babbonat.PokemonSpreader;

import com.babbonat.PokemonSpreader.domain.PokeEntity;
import com.babbonat.PokemonSpreader.services.ShowdownImporter;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Map;

@SpringBootApplication
public class PokemonSpreaderApplication {

	public static void main(String[] args)
	{
		Map<Integer, PokeEntity> dex = ShowdownImporter.getJSON();

		System.out.println(dex.get(6));
	}

}
