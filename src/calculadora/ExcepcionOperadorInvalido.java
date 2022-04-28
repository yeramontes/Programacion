package calculadora;

public class ExcepcionOperadorInvalido extends Exception {
	private static final String DESCRIPCION = "Has introducido un valor que no se corresponde con un operador.";
	public String toString() {
		return DESCRIPCION;
	}
}
