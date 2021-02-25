package com.example.Main.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Main.entidades.Tienda;

@Repository
public interface TiendaDao extends CrudRepository<Tienda, Integer>{

}
