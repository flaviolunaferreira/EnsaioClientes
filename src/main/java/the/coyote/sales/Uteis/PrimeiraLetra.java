package the.coyote.sales.Uteis;

public class PrimeiraLetra {
	
	/**
	 * Muda a primeira letra para maiuscula de todas as palavras que tenham mais deo
	 * que duas letras
	 * @param texto  a ser mudado
	 * @return Texto mudado
	 */
    public static final String Mudar(String texto) {
    	
        String sNova = "";
        
        for (String s : texto.toLowerCase().split(" ")) { 
            if (!"".equals(s)) {
                if (!"".equals(sNova)) {
                    sNova += " ";
                }
                if (s.length() > 2) {         
                    sNova += s.substring(0, 1).toUpperCase() + s.substring(1);
                } else {
                    sNova += s;
                }
            }
        }
        
        return ("" + sNova + "");
    }
}
