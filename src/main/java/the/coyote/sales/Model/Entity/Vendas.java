package the.coyote.sales.Model.Entity;

import java.util.List;
import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vendas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idVenda;
	
	private LocalDate data;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCliente")
	private Clientes clientes;
	
	@NotNull
	private int LocalDeEntrega;
	
	private String Situacao;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = {
			CascadeType.MERGE, CascadeType.REMOVE, CascadeType.PERSIST
	})
	@JoinColumn(name = "IdDaVenda")
	private List<ItensDeVenda> itensDeVendas;
	
}
