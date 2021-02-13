package com.educacionit.jse.integrador.baseDeDatos;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoDAO extends CrudRepository<Producto, Integer> {

    
}
