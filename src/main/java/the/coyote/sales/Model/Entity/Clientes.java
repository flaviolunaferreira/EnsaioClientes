package the.coyote.sales.Model.Entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@MappedSuperclass
public class Clientes extends Usuarios{
	
	@OneToMany(fetch = FetchType.LAZY, cascade = {
			CascadeType.MERGE, CascadeType.REMOVE, CascadeType.PERSIST
	})
	@JoinColumn(name = "idEndereco")
	private List<Enderecos> enderecos;

	@OneToMany(fetch = FetchType.LAZY, cascade = {
			CascadeType.MERGE, CascadeType.REMOVE, CascadeType.PERSIST
	})
	@JoinColumn(name = "idFone")
	private List<Fones> fone;
	
	@NotNull
	private BigDecimal Limite;
	
	@NotNull
	private String documento;
	
	@NotNull
	private String Situacao;
		
}
