package the.coyote.sales.Model.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import the.coyote.sales.Model.Entity.Produtos;

@Repository
public interface ProdutosRepository extends PagingAndSortingRepository<Produtos, Integer>{

	Iterable<Produtos> findByNomeContainingIgnoreCase(String texto);
	Iterable<Produtos> findByDescricaoContainingIgnoreCase(String texto);
	
}
