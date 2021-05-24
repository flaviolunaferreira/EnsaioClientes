package the.coyote.sales.Model.Entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


@Entity
public class Clientes extends Usuarios{

	@NotNull
	private BigDecimal Limite;
	
	@NotNull
	private String documento;
	
	@NotNull
	private String Situacao;
		
}
