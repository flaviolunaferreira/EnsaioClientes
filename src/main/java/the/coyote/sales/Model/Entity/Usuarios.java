package the.coyote.sales.Model.Entity;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity //tirei porque estava gerando apenas a classe usuarios.
@Data
@AllArgsConstructor
@NoArgsConstructor
abstract class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	@NotNull
	private String nome;
	
	@OneToMany
	private List<Enderecos> enderecos;
	
	@OneToMany
	private List<Fones> fones;
	
	private String tipo;
	
	
}
