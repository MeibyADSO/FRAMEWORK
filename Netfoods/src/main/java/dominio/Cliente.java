package dominio;

import java.io.Serializable;


public class Cliente implements Serializable{
    private static final long serialVersionUID = -6364236923810946624L;

    private int idCliente;
    private String nombre;
    private String email;
    private String telefono;
     private String estado;
    

    public Cliente() {
    }

    public Cliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(String nombre,  String email, String telefono, String estado) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.estado=estado;
    }

    public Cliente(int idCliente, String nombre, String email, String telefono, String estado) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
         this.estado=estado;

    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

  

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", email=" + email + ", telefono=" + telefono + '}';
    }
    
}
