package the.coyote.sales.Model.Entity;

import javax.persistence.*;
import javax.validation.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fotos {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idFotos;
	
	@NotNull
	private String url;
	
}
