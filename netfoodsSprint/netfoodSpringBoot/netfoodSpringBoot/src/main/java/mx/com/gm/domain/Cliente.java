package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    
    @Column(name = "idCliente")
    private Long idCliente;
     @Column(name = "Nombre")
    private String nombre;
      @Column(name = "Estado")
    private String estado;
     @Column(name = "Email")
    private String email;
     @Column(name = "Telefono")

    private String telefono;
}
