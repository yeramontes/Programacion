package restaurantes;

public class Restaurante {
	private String nombre;
	private String direccion;
	private String ciudad;
	private String estado;
	private String cPostal;
	
	public Restaurante(String nombre, String direccion, String ciudad, String estado, String cPostal) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.estado = estado;
		this.cPostal = cPostal;
	}
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getCiudad() {
		return ciudad;
	}



	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public String getcPostal() {
		return cPostal;
	}



	public void setcPostal(String cPostal) {
		this.cPostal = cPostal;
	}



	public String toString() {
		return nombre + "," + direccion + "," + ciudad + "," + estado + "," + cPostal;
	}
}
