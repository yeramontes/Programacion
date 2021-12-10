package relojDigitalAlarma;

public class Alarma {
	private int hora;
	private int minutos;
	
	public Alarma() {
		this.hora = 7;
		this.minutos = 0;
	}
	
	public void setHoraAlarma(int hora, int minutos) {
		this.hora = hora;
		this.minutos = minutos;
	}
	
	public String getHoraAlarma() {
		return String.format("%02d", hora) + ":" + String.format("%02d", minutos);
	}
}
