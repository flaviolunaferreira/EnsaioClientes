package the.coyote.sales.Uteis.CpfCgc;


public class Validar {

	/**
	 * Metodo que calcula o digito verificador de acordo com as regras da redeita
	 * @param doc String contendo Numero do documento a ser verificado
	 * @param chave Array com numeros de referencia para calculo dos digitos
	 * @return Boolean
	 */
	public static boolean validarDoc(String doc, int[] chave) {
		
		int posicao = 1;

		int tamanho = doc.length() == 11 ? 9 : 12; 
		
		String temp = doc.substring(0, tamanho);

		int[] arrayDigito1 = mudaParaArray(temp);
		
		String digito1 = calculaDigito(chave, arrayDigito1, posicao);
		
		temp = temp + digito1;

		posicao -= 1;
		
		int[] arrayDigito2 = mudaParaArray(temp);
		
		return doc.endsWith(calculaDigito(chave, arrayDigito2, posicao));		
	}
	
	/**
	 * Mudando String recebida para array de numeros
	 * @param tamanho
	 * @param String de numeros
	 * @return array de numeros 
	 */
	private static int[] mudaParaArray(String doc) {
		
		int[] result = new int[doc.length()];
		
		for (int i = 0; i < doc.length(); i++ ) {	
			result[i] = Integer.parseInt(doc.substring(i, i + 1));
		}
			
		return result;
	}

	
	/**
	 * Multiplica duas arrays na ordem de indece.
	 * @param chave base para a multiplicação
	 * @param numeros comvertidos em array da string recebida
	 * @return Digito verificador	
	 */
	private static String calculaDigito(int[] chave, int[] doc, int posicao) {
		
		int soma = 0;
		int resto = 0;

		for (int i = 0; i < doc.length; i++) {
			soma += doc[i] * chave[i + posicao];
		}
		
		resto = soma % 11;
		resto = resto < 2 ? resto = 0 : 11 - resto; 
		
		return String.valueOf(resto);
	}	
}
