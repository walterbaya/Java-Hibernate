package com.example.Laboratorio2;

import com.example.Laboratorio2.beans.Persona;
import com.example.Laboratorio2.DAO.PersonaDAO;
import com.example.Laboratorio2.DAO.TelefonoDAO;
import com.example.Laboratorio2.beans.Domicilio;
import com.example.Laboratorio2.beans.Telefono;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Laboratorio2Application implements CommandLineRunner {

    @Autowired
    PersonaDAO persona;

    @Autowired
    TelefonoDAO telefono;

    public static void main(String[] args) {
        SpringApplication.run(Laboratorio2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Persona pepe = new Persona("Pepe", "Ventosa", 70);
        Telefono tel1 = new Telefono("Linea Fija", 114653344);
        tel1.setPersona(pepe);
        pepe.getTelefonos().add(tel1);
        Domicilio dom1 = new Domicilio("Jose luis pedrales", 1656);
        pepe.getDomicilios().add(dom1);
        persona.save(pepe);

    }

}
