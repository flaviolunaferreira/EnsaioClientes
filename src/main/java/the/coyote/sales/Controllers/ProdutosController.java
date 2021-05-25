package the.coyote.sales.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import the.coyote.sales.Model.Entity.Produtos;
import the.coyote.sales.Model.Repository.ProdutosRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {

	@Autowired
	private ProdutosRepository produtosRepository;
	
	@GetMapping
	public @ResponseBody Iterable<Produtos> listarTodos() {
		return produtosRepository.findAll();
	}
	
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public Produtos salvaProduto(@RequestBody Produtos produtos) {
		produtosRepository.save(produtos);
		return produtos;
	}
	
	@GetMapping(path = "/{id}")
	public @ResponseBody Optional<Produtos> procuraPorId(@PathVariable int id) {
		return produtosRepository.findById(id);
	}
	
	@GetMapping(path = "/nome/{texto}")
	public Iterable<Produtos> procurarNome(@PathVariable String texto){
		return produtosRepository.findByNomeContainingIgnoreCase(texto);
	}
	
	@GetMapping(path = "/descricao/{texto}")
	public Iterable<Produtos> procurarDescricao(@PathVariable String texto){
		return produtosRepository.findByDescricaoContainingIgnoreCase(texto);
	}

	@DeleteMapping(path = "/{id}")
	public @ResponseBody String apagarPorId(@PathVariable int id) {
		produtosRepository.deleteById(id);
		return "Produto excluido";
	}

	// cuidar de requisições com muitos itens
	@GetMapping(path = "/page/{pageNumber}/{itens}")
	public Iterable<Produtos> procurarPorPagina(@PathVariable int pageNumber, @PathVariable int itens) {
		if (itens > 50) itens = 50; // se a requisição tiver mais de 50 itens
		Pageable page = PageRequest.of(pageNumber, itens);
		return produtosRepository.findAll(page);
	}
	
}

