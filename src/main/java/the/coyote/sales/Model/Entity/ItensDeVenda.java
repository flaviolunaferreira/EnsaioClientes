package the.coyote.sales.Model.Entity;

import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class ItensDeVenda {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idItensDeVenda;
	
	private Long quantidade;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProduto")
	private List<Produtos> produtos;
	
}
