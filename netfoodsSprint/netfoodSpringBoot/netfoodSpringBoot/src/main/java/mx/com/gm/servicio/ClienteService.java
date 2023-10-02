package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Cliente;

public interface ClienteService {
    
    public List<Cliente> listarClientes();
    
    public void guardar(Cliente persona);
    
    public void eliminar(Cliente persona);
    
    public Cliente encontrarClientes(Cliente persona);
}
