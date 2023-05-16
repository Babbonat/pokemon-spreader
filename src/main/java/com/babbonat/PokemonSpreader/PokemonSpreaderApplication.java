package com.babbonat.PokemonSpreader;

import com.babbonat.PokemonSpreader.services.ShowdownImporter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PokemonSpreaderApplication {

	public static void main(String[] args)
	{
		String json = ShowdownImporter.getJSON();
		System.out.println(json);
	}

}
