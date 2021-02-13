package com.example.Main;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Main.Dao.LocalDeComidaDao;
import com.example.Main.Dao.LocalDeMusicaDao;
import com.example.Main.Dao.LocalDeMusicaDaoJ;
import com.example.Main.entidadesJerarquia.LocalDeComida;
import com.example.Main.entidadesJerarquia.LocalDeMusicaJ;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {

	@Autowired
	LocalDeMusicaDao daoLocal;

	@Autowired
	LocalDeComidaDao localC;
	
	@Autowired
	LocalDeMusicaDaoJ localJ;
	
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*
		 * String marcasBaterias = ""; marcasBaterias = "maped, drumFonia";
		 * 
		 * String marcasBajos = "Fender, Gibson";
		 * 
		 * String marcasGuitarras = "Ibanez, Shecter";
		 * 
		 * LocalDeMusica local = new LocalDeMusica("MusicMan",
		 * "av. del libertador 23201", 35, marcasGuitarras, marcasBajos, marcasBaterias,
		 * 1250.50, true);
		 * 
		 * daoLocal.save(local);
		 * 
		 * daoLocal.findAll().forEach(l -> { System.out.println(l.getMarcasBaterías());
		 * });
		 * 
		 * }
		 */
		
		String marcasBaterias = "";

		marcasBaterias = "maped, drumFonia";

		String marcasBajos = "Fender, Gibson";

		String marcasGuitarras = "Ibanez, Shecter";

		LocalDeMusicaJ local = new LocalDeMusicaJ("MusicMan", "av. del libertador 23201", 35, marcasGuitarras,
				marcasBajos, marcasBaterias, 1250.50, true);
		
		localJ.save(local);
		
		String marcasPizzas = "stack, quesosa";

		String marcasHamburguesas = "mcRonalds, BurguerStink";

		LocalDeComida foodStore = new LocalDeComida("Wallito", "Carabobo 2244", 20000, marcasPizzas, marcasHamburguesas,
				1800, 12000);
		
		localC.save(foodStore);
	}

}
