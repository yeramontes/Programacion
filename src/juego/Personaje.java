package juego;

public class Personaje {
	private String nombre;
	private int ejeX;
	private int ejeY;
	private String posicion;
	private char orientacion;
	
	public Personaje(String nombre) {
		this.nombre = nombre;
		ejeX = 0;
		ejeY = 0;
		orientacion = 'N';
	}
	
	public void avanzar(int avance) {
		
		switch(orientacion) {
		case 'N':
			this.ejeY += avance;
			break;
		case 'E':
			this.ejeX += avance;
			break;
		case 'S':
			this.ejeY -= avance;
			break;
		case 'O':
			this.ejeX -= avance;
			break;
		}
		
	}
	
	public void girar() {
		
		switch(orientacion) {
		case 'N':
			this.orientacion = 'E';
			break;
		case 'E':
			this.orientacion = 'S';
			break;
		case 'S':
			this.orientacion = 'O';
			break;
		case 'O':
			this.orientacion = 'N';
			break;
		}

	}
	
	public String toString() {
		StringBuilder resultado = new StringBuilder();
		posicion = "[" + ejeX + " , " + ejeY + "]";
		resultado.append("Personaje : " + nombre);
		resultado.append("\nOrientacion : " + orientacion);
		resultado.append("\nPoaicion : " +  posicion);
		return resultado.toString();
	}	
	
}
