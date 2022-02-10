package pkgaeropuerto.modelo;

public class Vuelo implements Comparable<Vuelo>{
	protected String destino;
	protected String avion;
	protected int plazas;
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n\nVuelo " + this.getClass());
		sb.append("\n-------------------------");
		sb.append("\n\nDestino: " + this.destino);
		sb.append("\nAvion: " + this.avion);
		sb.append("\nPlazas: " + this.plazas);
		
		return sb.toString();
	}
	
	

	public String getDestino() {
		return destino;
	}



	public void setDestino(String destino) {
		this.destino = destino;
	}



	public String getAvion() {
		return avion;
	}



	public void setAvion(String avion) {
		this.avion = avion;
	}



	public int getPlazas() {
		return plazas;
	}



	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}



	@Override
	public int compareTo(Vuelo o) {
		
		return this.destino.compareTo(o.destino);
	}
}
