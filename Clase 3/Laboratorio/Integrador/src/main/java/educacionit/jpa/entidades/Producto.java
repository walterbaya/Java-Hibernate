package educacionit.jpa.entidades;

import java.io.Serializable;
import javax.persistence.*;

@Entity(name = "productos")
@NamedQueries({
    @NamedQuery(name="getProducto", query = "SELECT p FROM productos p WHERE p.descripcion = :descripcion"),
    //@NamedQuery(name="modifica", query = "UPDATE productos p SET p.precio =:precio , p.descripcion =:descripcion  WHERE p.id =:id")
})

public class Producto implements Serializable {

    @Id
    @Column(name = "producto_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double precio;
    private String descripcion;

    public Producto() {
    }

    public Producto(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto [precio=" + precio + ", descripcion=" + descripcion + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
