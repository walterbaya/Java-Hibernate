package educacionit.jpa.dao;

import educacionit.jpa.entidades.Producto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.springframework.stereotype.Service;

@Service
public class ProductoDaoImpl {

    @PersistenceContext
    private EntityManager em;

    public Producto getProducto(String descripcion) {
        Query query = (Query) em.createNamedQuery("getProducto");
        query.setParameter("descripcion", descripcion);
        return (Producto) query.getResultList().get(0);
    }

    public List<Producto> getProductosConPrecio(double precio) {
        //Creo un constructor de criteriaQuerys
        CriteriaBuilder constructor = em.getCriteriaBuilder();
        //Creo un objeto CriteriaQuery a partir del constructor y la clase
        //es un query al cual se le aplicaran criterios.
        CriteriaQuery<Producto> query = constructor.createQuery(Producto.class);
        //creo una raiz del objeto Producto, decimos que el criteriQuery va a ser de la clase producto
        Root<Producto> root = query.from(Producto.class);

        /*usando el query, al mismo le digo que se quede con aquellos 
        de manera que usando el constructor analizo si el precio solicitado corresponde
        al precio del objeto producto, perteneciente a la tabla de productos.
        le aplicamos las restricciones o sea los criterios.
         */
        query.where(constructor.equal(root.get("precio"), precio));

        //usando el entityManager creo la query, la ejecuta y obtengo la lista resultante.
        return em.createQuery(query).getResultList();
    }
/*
    Esta version de update solo es valida si tenemos JPA 2.1 o superior.
    public void modifica(Producto p) {
        Query query = em.createNamedQuery("modifica", Producto.class);
        query.setParameter(1, p.getPrecio());
        query.setParameter(2, p.getDescripcion());
        query.setParameter(3, p.getId());
        query.executeUpdate();
    }
*/
}
