package pkgaeropuerto.modelo;

import java.time.LocalTime;

public class Regular extends Vuelo{
	private LocalTime horario;
	
	public Regular(String destino,String avion, int plazas, int plazasLibres, double precioBillete) {
		super(destino, avion, plazas, plazasLibres, calcularBillete(precioBillete, plazasLibres));
		this.horario = LocalTime.now();
	}
	
	private static double calcularBillete(double precioBillete, int plazasLibres) {
		return (precioBillete * 1.1) + (5 * plazasLibres);
	}
	
	
	public void setPlazasLibres(int plazasLibres) {
		this.plazasLibres = plazasLibres;
	}
	
	public int getPlazasLibres() {
		return this.plazasLibres;
	}
	
	public LocalTime getHorario() {
		return this.horario;
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
		sb.append("\nPrecio billete: " + String.format("%.2f", this.precioBillete));
		return sb.toString();
	}
}
