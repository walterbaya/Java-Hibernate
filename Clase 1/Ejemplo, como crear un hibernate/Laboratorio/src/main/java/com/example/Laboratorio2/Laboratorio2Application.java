package com.example.Laboratorio2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Laboratorio2Application implements CommandLineRunner{

        @Autowired
        PersonaDAO persona;
	public static void main(String[] args) {
		SpringApplication.run(Laboratorio2Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Persona jose = new Persona(1,"Jose");
        persona.save(jose);
    }

}
