package the.coyote.sales.Model.Entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Enderecos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idEndereco;
	
	private String rua;
	private String numero;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	
}
