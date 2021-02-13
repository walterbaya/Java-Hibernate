package com.example.Main.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.Main.entidadesJerarquia.LocalDeComida;

@Repository
public interface LocalDeComidaDao extends CrudRepository<LocalDeComida, Integer>{

}
