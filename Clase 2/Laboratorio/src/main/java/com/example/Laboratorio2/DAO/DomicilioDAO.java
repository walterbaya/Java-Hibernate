package com.example.Laboratorio2.DAO;

import com.example.Laboratorio2.beans.Domicilio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioDAO extends CrudRepository<Domicilio, Integer>{
    
}
