package com.example.Laboratorio2.DAO;

import com.example.Laboratorio2.beans.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaDAO extends CrudRepository<Persona, Integer>{


}
