package palabra;

public class StringClass {
	private String str;
	private char[] vocales = {'a', 'e', 'i', 'o', 'u'};
	
	public StringClass(String str) {
		this.str = str;
	}
	
	public static void main(String [] args) {
		StringClass str = new StringClass("palabra");
		System.out.println(str.toString());
		System.out.println(str.guionizar());
		System.out.println(str.contarVocales());
	}
	
	
	public String guionizar() {
		char guion = '-';
		String resultado = "";
		for(int i = 0; i < (str.length()); i++) {
			resultado += str.charAt(i);
			if(i < (str.length() - 1)) resultado += guion;
		}
		return resultado;
	}
	
	public int contarVocales() {
		int contador = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(esVocal(str.charAt(i))) contador++;
		}
		return contador;
		
	}
	
	private boolean esVocal(char car) {
		for(int i = 0; i < vocales.length; i++) {
			if(car == vocales[i]) return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StringClass [str=");
		builder.append(str);
		builder.append("]");
		return builder.toString();
	}
	
}
