package the.coyote.sales.Model.Entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produtos {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idProduto;
	
	@NotNull
	@NotBlank
	private String nome;
	
	private String descricao;
	private Long estoque;
	
	private BigDecimal preco;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = {
			CascadeType.MERGE, CascadeType.REMOVE, CascadeType.PERSIST
	})
	@JoinColumn(name = "idFotos")
	private List<Fotos> fotos;
	
	
}
