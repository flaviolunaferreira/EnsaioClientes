package the.coyote.sales.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

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
	
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Clientes salvaCliente(@RequestBody Clientes clientes) {
		clientesRepository.save(clientes);
		return clientes;
	}
	
	@GetMapping(path = "/{id}")
	public @ResponseBody Optional<Clientes> procuraPorId(@PathVariable int id) {
		return clientesRepository.findById(id);
	}
	
	@GetMapping(path = "/nome/{texto}")
	public Iterable<Clientes> procurarNome(@PathVariable String texto){
		return clientesRepository.findByNomeContainingIgnoreCase(texto);
	}
	
	@DeleteMapping(path = "/{id}")
	public @ResponseBody String apagarPorId(@PathVariable int id) {
		clientesRepository.deleteById(id);
		return "Cliente excluido";
	}

	// cuidar de requisições com muitos itens
	@GetMapping(path = "/page/{pageNumber}/{itens}")
	public Iterable<Clientes> procurarPorPagina(@PathVariable int pageNumber, @PathVariable int itens) {
		if (itens > 50) itens = 50; // se a requisição tiver mais de 50 itens
		Pageable page = PageRequest.of(pageNumber, itens);
		return clientesRepository.findAll(page);
	}
	
	
}
