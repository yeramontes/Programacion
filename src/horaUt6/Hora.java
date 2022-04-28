package horaUt6;

public class Hora {
	private int horas;
	private int minutos;
	private int segundos;
	private static final int MAX_MIN = 59;
	private static final int MIN_MIN = 0;
	
	public Hora(int horas, int minutos, int segundos) throws HoraException{
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
		if(!horasBien(this.horas)) throw new HoraException();
		if(!minutosBien(this.minutos)) throw new HoraException();
		if(!minutosBien(this.segundos)) throw new HoraException();
	}
	
	private static boolean horasBien(int horas) {
		return (horas >= 0 && horas < 24);
	}
	
	private static boolean minutosBien(int mins) {
		return (mins >= 0 && mins < 60);
	}
	
	
}
