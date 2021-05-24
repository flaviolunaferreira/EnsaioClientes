package the.coyote.sales.Model.Entity;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


@Entity
public class Colaboradores extends Usuarios{

	@NotNull
	private String documento;
	
	@NotNull
	private String funcao;
	
}
