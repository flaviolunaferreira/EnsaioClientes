package the.coyote.sales.Uteis.CpfCgc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ValidarTest {
	
	int[] ChaveCgc = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
	int[] ChaveCpf = { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2 };
	
	String cpf1 = "98738267420";
	String cgc = "43420128000117";
	String cgcf = "43420128001117";
	
	@Test
	void test() {
	
		boolean cpfTrue = Validar.validarDoc(cpf1, ChaveCpf);
		assertTrue(cpfTrue);
		
		boolean cpfFalse = Validar.validarDoc(cpf1, ChaveCgc);
		assertFalse(cpfFalse);
		
		boolean cgcTrue = Validar.validarDoc(cgc, ChaveCgc);
		assertTrue(cgcTrue);
		
		boolean cgcFalse = Validar.validarDoc(cgcf, ChaveCgc);
		assertFalse(cgcFalse);
		
	}
	
	
}
