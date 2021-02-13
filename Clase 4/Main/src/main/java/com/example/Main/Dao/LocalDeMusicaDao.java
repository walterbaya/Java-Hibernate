package com.example.Main.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Main.entidades.LocalDeMusica;

@Repository
public interface LocalDeMusicaDao extends CrudRepository<LocalDeMusica, Integer>{

}
