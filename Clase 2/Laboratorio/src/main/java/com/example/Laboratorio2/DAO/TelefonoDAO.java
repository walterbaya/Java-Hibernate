package com.example.Laboratorio2.DAO;

import com.example.Laboratorio2.beans.Telefono;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefonoDAO extends CrudRepository<Telefono, Integer>{
    
}
