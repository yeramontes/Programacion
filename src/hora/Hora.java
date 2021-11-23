package hora;

public class Hora {
	private int hora;
	private int minutos;
	private int segundos;
	
	public Hora(int hora, int minutos, int segundo) {
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundo;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundo) {
		this.segundos = segundo;
	}
	
	public int aSegundos() {
		int enSegundos = (hora * 3600) + (minutos * 60) + segundos;
		return enSegundos;
	}
	
	public void avanzarSegudo() {
		segundos++;
		if(segundos == 60) {
			segundos = 0;
			minutos++;
			if(minutos == 60) {
				minutos = 0;
				hora++;
				if(hora == 24) {
					hora = 0;
				}
			}
		}
	}
	
	public void atrasarSegundo() {
		segundos--;
		if(segundos < 0) {
			segundos = 59;
			minutos--;
			if(minutos < 0) {
				minutos = 59;
				hora--;
				if(hora < 0) {
					hora = 23;
				}
			}
		}
	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(String.format("%02d", hora));
		str.append(":");
		str.append(String.format("%02d", minutos));
		str.append(":");
		str.append(String.format("%02d", segundos));
		return str.toString();
	}
}
