package the.coyote.sales.Model.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;


@Entity
public class Colaboradores extends Usuarios{

	@OneToMany(fetch = FetchType.LAZY, cascade = {
			CascadeType.MERGE, CascadeType.REMOVE, CascadeType.PERSIST
	})
	@JoinColumn(name = "id")
	private List<Enderecos> enderecos;

	@OneToMany(fetch = FetchType.LAZY, cascade = {
			CascadeType.MERGE, CascadeType.REMOVE, CascadeType.PERSIST
	})
	@JoinColumn(name = "id")
	private List<Fones> fone;
	
	@NotNull
	private String documento;
	
	@NotNull
	private String funcao;
	
}
