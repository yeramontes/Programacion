package calculadora;

public class DivisionPorCeroException extends Exception {
	private static final String DESCRIP = "Estas haciendo una division entre 0";
	public String toString() {
		return DESCRIP;
	}
}
