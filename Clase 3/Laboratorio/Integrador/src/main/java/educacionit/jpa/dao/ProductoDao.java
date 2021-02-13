package educacionit.jpa.dao;

import educacionit.jpa.entidades.Producto;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoDao extends CrudRepository<Producto, Integer> {

    @Query(value = "SELECT p FROM productos p")
    public List<Producto> getProductos();

    default Producto getProducto(int id) {
        Optional<Producto> optionalProduct = this.findById(id);
        Producto product = optionalProduct.get();
        return product;
    }

    default void elimina(int id) {
        this.deleteById(id);
    }

    default boolean existe(String descripcion) {
        boolean res = false;
        List<Producto> todos = getProductos();
        for(Producto p : todos){
            if(p.getDescripcion().equals(descripcion)){
                res = true;
            }
        }
        return res;
    }

    default void inserta(Producto p){
        this.save(p);
    }
    
    
    default void modifica(Producto p) {
        this.save(p);
    }
}
