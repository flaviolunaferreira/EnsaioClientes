package the.coyote.sales.Uteis.CpfCgc;

public class VerTipo {
	
	/**
	 * Verifica qual o tipo de documento que foi informado
	 * @param doc contendo o tipo de documentos
	 * @return boolean
	 */
	public static boolean verificar(String doc) {
		
		int[] ChaveCgc = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
		int[] ChaveCpf = { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2 };
		
		doc.trim();
		doc = doc.replace(",", "").replace(".", "").replace("-", "").replace("/", "");
		
		int tamanho = doc.length();
		
		switch (tamanho) {
		case 11 :
			return Validar.validarDoc(doc, ChaveCpf);
		case 14 :
			return Validar.validarDoc(doc, ChaveCgc);
		default:
			return false;
		}
		
	}
	

}
