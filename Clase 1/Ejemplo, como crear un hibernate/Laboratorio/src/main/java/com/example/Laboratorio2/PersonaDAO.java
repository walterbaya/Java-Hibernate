package com.example.Laboratorio2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaDAO extends CrudRepository<Persona, Integer>{
    
}
