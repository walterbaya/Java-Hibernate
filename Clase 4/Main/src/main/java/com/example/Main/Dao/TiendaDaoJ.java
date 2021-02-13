package com.example.Main.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.Main.entidadesJerarquia.TiendaJ;

@Repository
public interface TiendaDaoJ extends CrudRepository<TiendaJ, Integer>{

}
