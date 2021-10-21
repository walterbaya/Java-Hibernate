package sga.domain;

import java.io.Serializable;
import javax.persistence. *;
import javax.validation.constraints.Size;

/**
 *
 * @author Walter
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario"),
    @NamedQuery(name = "Usuario.findByUsername", query = "SELECT u FROM Usuario u WHERE u.username = :username"),
    @NamedQuery(name = "Usuario.findByPassword", query = "SELECT u FROM Usuario u WHERE u.password = :password")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    //Esta validacion se va a hacer en ambos lados
    @Size(max = 45)
    private String username;
    @Size(max = 45)
    private String password;

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }
    //name hace referencia a nuestra tabla actual, el nombre de la llave foreign.
    //referencedColumnName hace referencia al nombre de la llave pero en la tabla de persona.
    @JoinColumns({
        @JoinColumn(name = "id_persona", referencedColumnName = "id_persona"),
        @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")})
    
    @ManyToOne
    private Persona persona;

    public Usuario() {
    }

    public Usuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    public Usuario(Integer idUsuario, String username, String password, Persona persona) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.password = password;
        this.persona = persona;
    }


    
}
