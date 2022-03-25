package casinos;

public class Casino {
	private String nombre;
	private int cantidadFichas;
	private int mesasPoker;
	private String tipoRuleta;
	private double precioCopa;
	private boolean hayTorneo;
	public Casino(String nombre, int cantidadFichas, int mesasPoker, String tipoRuleta, double precioCopa,
			boolean hayTorneo) {
		super();
		this.nombre = nombre;
		this.cantidadFichas = cantidadFichas;
		this.mesasPoker = mesasPoker;
		this.tipoRuleta = tipoRuleta;
		this.precioCopa = precioCopa;
		this.hayTorneo = hayTorneo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidadFichas() {
		return cantidadFichas;
	}
	public void setCantidadFichas(int cantidadFichas) {
		this.cantidadFichas = cantidadFichas;
	}
	public int getMesasPoker() {
		return mesasPoker;
	}
	public void setMesasPoker(int mesasPoker) {
		this.mesasPoker = mesasPoker;
	}
	public String getTipoRuleta() {
		return tipoRuleta;
	}
	public void setTipoRuleta(String tipoRuleta) {
		this.tipoRuleta = tipoRuleta;
	}
	public double getPrecioCopa() {
		return precioCopa;
	}
	public void setPrecioCopa(double precioCopa) {
		this.precioCopa = precioCopa;
	}
	public boolean isHayTorneo() {
		return hayTorneo;
	}
	public void setHayTorneo(boolean hayTorneo) {
		this.hayTorneo = hayTorneo;
	}
	
}
