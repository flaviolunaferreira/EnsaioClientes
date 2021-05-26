package the.coyote.sales.Model.Entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItensDeVenda {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idItemVenda;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProduto")
	private Produtos produtos;
	
	@Min(value = 1)
	private int quantidade;
	
}
