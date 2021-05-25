package the.coyote.sales.Model.Entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Data;


@Entity
@Data
public class Clientes{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idCliente;
	
	@NotNull
	private String nome;
	
	@NotNull
	@Email
	private String email;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = {
			CascadeType.MERGE, CascadeType.REMOVE, CascadeType.PERSIST
	})
	@JoinColumn(name = "idCliente")
	private List<Enderecos> enderecos;

	@OneToMany(fetch = FetchType.LAZY, cascade = {
			CascadeType.MERGE, CascadeType.REMOVE, CascadeType.PERSIST
	})
	@JoinColumn(name = "idCliente")
	private List<Fones> fone;
	
	@NotNull
	private BigDecimal Limite;
	
	@NotNull
	private String documento;
	
	@NotNull
	private String Situacao;
		
}
