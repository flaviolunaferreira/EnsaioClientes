package the.coyote.sales.Uteis.CpfCgc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerTipoTest {

	int[] ChaveCgc = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
	int[] ChaveCpf = { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2 };
	
	String cpf1 = "98738267420";
	String cpf2 = "987.382.674-20";
	String cpf3 = "987.382.674-21";
	String cpf4 = "987.3824674-20";
	String cpf5 = "987.382674-20";
	String cpf6 = "392.873.690-62";
	
	
	String cgc1 = "43420128000117";
	String cgc2 = "43.420.128/0001-17";
	String cgc3 = "43420.1280001-17";
	String cgc4 = "43420.128000117 ";
	
	
	@Test
	void test() {

		boolean testeCpf1 = VerTipo.verificar(cpf1);
		assertTrue(testeCpf1);
		
		boolean testeCpf2 = VerTipo.verificar(cpf2);
		assertTrue(testeCpf2);
		
		boolean testeCpf3 = VerTipo.verificar(cpf3);
		assertFalse(testeCpf3);
		
		boolean testeCpf4 = VerTipo.verificar(cpf4);
		assertFalse(testeCpf4);
		
		boolean testeCpf5 = VerTipo.verificar(cpf5);
		assertTrue(testeCpf5);
		
		boolean testeCpf6 = VerTipo.verificar(cpf6);
		assertTrue(testeCpf6);
		
		boolean testeCgc1 = VerTipo.verificar(cgc1);
		assertTrue(testeCgc1);
		
		boolean testeCgc2 = VerTipo.verificar(cgc2);
		assertTrue(testeCgc2);
		
		boolean testeCgc3 = VerTipo.verificar(cgc3);
		assertTrue(testeCgc3);
		
		boolean testeCgc4 = VerTipo.verificar(cgc4);
		assertFalse(testeCgc4);
		
	}

}
