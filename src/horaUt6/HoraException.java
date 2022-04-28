package horaUt6;

public class HoraException extends Exception{
	private static final String privateMensaje = "Revise los datos introducidos.\nProbablemente alguno de los datos no sea correcto o la posicion no sea la indicada.\nRecuerde que el formato de entrada es Horas:Minutos:Segundos.";
	private String mensaje;
	
	public HoraException() {
		
	}
	public HoraException(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public String toString() {
		return privateMensaje + "\n" + mensaje;
	}
}
