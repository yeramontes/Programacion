package pkgaeropuerto.modelo;

public class Charter extends Vuelo{
	
	private String nif;

	public Charter(String destino,String avion, int plazas, int plazasLibres, double precioBillete, String nif) {
		super(destino, avion, plazas, plazasLibres, calcularPrecio(precioBillete, plazasLibres));
		this.nif = nif;
	}
	
	private static double calcularPrecio(double precioBillete, int plazasLibres) {
		return (plazasLibres < 200) ? (precioBillete * 1.25 + 50) : (precioBillete * 1.25);
	}

	public int getNif() {
		return Integer.parseInt(nif);
	}
	
	public String getNifString() {
		return nif;
	}

	public void setNif(int nif) {
		this.nif = String.valueOf(nif);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n\nVuelo " + this.getClass().getSimpleName());
		sb.append("\n-------------------------");
		sb.append("\n\nDestino: " + this.destino);
		sb.append("\nAvion: " + this.avion);
		sb.append("\nPlazas: " + this.plazas);
		sb.append("\nNIF Empresa: " + this.nif);
		sb.append("\nPrecio billete: " + String.format("%.2f", this.precioBillete));
		return sb.toString();
	}
}
