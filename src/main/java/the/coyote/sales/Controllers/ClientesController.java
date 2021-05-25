package the.coyote.sales.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import the.coyote.sales.Model.Entity.Clientes;
import the.coyote.sales.Model.Repository.ClientesRepository;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

	@Autowired
	private ClientesRepository clientesRepository;
	
	@GetMapping
	public Iterable<Clientes> todosClientes() {
		return clientesRepository.findAll();
	}
	
	public @ResponseBody Clientes salvaCliente(@RequestBody Clientes clientes) {
		clientesRepository.save(clientes);
		return clientes;
	}
}
