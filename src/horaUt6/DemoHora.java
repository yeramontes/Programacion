package horaUt6;

public class DemoHora {
	public static void main(String[] args) throws HoraException {
		demo(19, 23, 70);
		new Hora(19, 23, 70);
	}
	
	public static void demo(int horas, int minutos, int segundos) {
		try {
			new Hora(horas, minutos, segundos);
		}catch(Exception HoraException){
			System.out.println("Error en el metodo Demo().");
		}
	}
}
