package the.coyote.sales.Model.Entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Vendas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idVenda;
	
	private LocalDate data;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUsuario")
	private List<Clientes> clientes;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = {
			CascadeType.MERGE, CascadeType.REMOVE, CascadeType.PERSIST
	})
	@JoinColumn(name = "idItensDeVenda")
	private List<ItensDeVenda> itensDeVenda;
}
