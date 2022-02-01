package animales;

public class Gato extends Animal {
	
	private String jugueteFavorito;
	
	public Gato(String nombre, int patas, Persona due�o, String juguete) {
		super(nombre, patas, due�o);
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
		
	}
}
