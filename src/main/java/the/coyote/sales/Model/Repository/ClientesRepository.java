package the.coyote.sales.Model.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import the.coyote.sales.Model.Entity.Clientes;

@Repository
public interface ClientesRepository extends PagingAndSortingRepository<Clientes, Integer> {

}
