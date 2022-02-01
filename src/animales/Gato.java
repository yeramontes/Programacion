package animales;

public class Gato extends Animal {
	
	private String jugueteFavorito;
	
	public Gato(String nombre, int patas, Persona dueño, String juguete) {
		super(nombre, patas, dueño);
		this.jugueteFavorito = juguete;
	}
	
	@Override
	public String emitirSonido() {
		return "Miau Miau";
	}
	
	public String comer() {
		return "Comer pescado";
	}

	@Override
	public void representacion() {
		System.out.println("Soy un gato, me llamo " + this.nombre + ", tengo " + this.patas + " patas, mi dueño es " + this.dueño.getNombre() + " y mi juguete favorito es " + this.jugueteFavorito);
	}
}
