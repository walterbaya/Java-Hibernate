package com.example.Main.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.Main.entidadesJerarquia.LocalDeMusicaJ;

@Repository
public interface LocalDeMusicaDaoJ extends CrudRepository<LocalDeMusicaJ, Integer>{

}
