package mx.com.gm.web;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import mx.com.gm.servicio.ClienteService;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/")
    public String inicio(Model model){
        var clientes = clienteService.listarClientes();
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("clientes", clientes);
        return "index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Cliente persona){
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(Cliente persona){
        clienteService.guardar(persona);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{idCliente}")
    public String editar(Cliente cliente, Model model){
        cliente = clienteService.encontrarClientes(cliente);
        model.addAttribute("cliente", cliente);
        return "modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Cliente cliente){
        clienteService.eliminar(cliente);
        return "redirect:/";
    }
}
