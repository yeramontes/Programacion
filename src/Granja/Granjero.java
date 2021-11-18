package Granja;

public class Granjero {
	private String nombre; 
	private String apellidos; 
	private int edad; 
	private char sexo;
	
	public Granjero(String nombre, String apellidos, int edad, char sexo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sexo = sexo;
	}

	public String toString() {
		String resultado = " ";
		resultado += "\nNombre: " + nombre;
		resultado += "\nApellidos: " + apellidos;
		resultado += "\nEdad: " + edad;
		resultado += "\nSexo: " + sexo;
		return resultado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}
