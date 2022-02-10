package pkgaeropuerto.modelo;

import java.time.LocalTime;

public class Regular extends Vuelo{
	private LocalTime horario;
	private int plazasLibres;
	
	public Regular(String destino,String avion, int plazas) {
		this.destino = destino;
		this.avion = avion;
		this.plazas = plazas;
		this.horario = LocalTime.now();
	}
	
	public Regular(String destino,String avion, int plazas, int plazasLibres) {
		this.destino = destino;
		this.avion = avion;
		this.plazas = plazas;
		this.plazasLibres = plazasLibres;
		this.horario = LocalTime.now();
	}
	
	
	public void setPlazasLibres(int plazasLibres) {
		this.plazasLibres = plazasLibres;
	}
	
	public int getPlazasLibres() {
		return this.plazasLibres;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n\nVuelo " + this.getClass().getSimpleName());
		sb.append("\n-------------------------");
		sb.append("\n\nDestino: " + this.destino);
		sb.append("\nAvion: " + this.avion);
		sb.append("\nPlazas: " + this.plazas);
		sb.append("\nPlazas libres: " + this.plazasLibres); 
		return sb.toString();
	}
}
