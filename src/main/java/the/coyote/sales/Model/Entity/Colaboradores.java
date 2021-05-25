package the.coyote.sales.Model.Entity;

import java.util.List;

import javax.persistence.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Data;


@Entity
@Data
public class Colaboradores {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idColaborador;
	
	@NotNull
	private String nome;
	
	@NotNull
	@Email
	private String email;

	@OneToMany(fetch = FetchType.LAZY, cascade = {
			CascadeType.MERGE, CascadeType.REMOVE, CascadeType.PERSIST
	})
	@JoinColumn(name = "idUsuario")
	private List<Enderecos> enderecos;

	@OneToMany(fetch = FetchType.LAZY, cascade = {
			CascadeType.MERGE, CascadeType.REMOVE, CascadeType.PERSIST
	})
	@JoinColumn(name = "idUsuario")
	private List<Fones> fone;
	
	@NotNull
	private String documento;
	
	@NotNull
	private String funcao;
	
}
