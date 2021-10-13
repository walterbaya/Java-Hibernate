package sga.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@NamedQueries({
    @NamedQuery(name="Persona.findAll", query = "SELECT p FROM Persona p ORDER BY p.idPersona")
})

@Table(name="persona")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_persona")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersona;

    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Persona() {

    }

    public Persona(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
