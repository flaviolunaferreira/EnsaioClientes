package the.coyote.sales.Model.Entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fones {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idFone;
	
	private String tipo;	
	private String fone;
	
}
