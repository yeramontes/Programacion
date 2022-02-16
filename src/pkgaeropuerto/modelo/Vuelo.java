package pkgaeropuerto.modelo;

public class Vuelo implements Comparable<Vuelo>{
	protected String destino;
	protected String avion;
	protected int plazas;
	protected int plazasLibres;
	protected double precioBillete;
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n\nVuelo " + this.getClass().getSimpleName());
		sb.append("\n-------------------------");
		sb.append("\n\nDestino: " + this.destino);
		sb.append("\nAvion: " + this.avion);
		sb.append("\nPlazas: " + this.plazas);
		sb.append("\nPrecio billete: " + String.format("%.2f", precioBillete));
		return sb.toString();
	}
	
	public double getPrecioBillete() {
		return precioBillete;
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
	
	
	@Override
	public boolean equals(Object obj) {
		Vuelo v = (Vuelo)(obj);
		return (this.getClass().getSimpleName().equals(v.getClass().getSimpleName())) && 
				(this.getDestino().equals(v.getDestino())) && (this.getAvion().equals(v.getAvion())) && 
				(this.getAvion().equals(v.getAvion())) &&  (this.getPlazas() == v.getPlazas()) && 
				(this.getPrecioBillete() == v.getPrecioBillete());
	}

}
