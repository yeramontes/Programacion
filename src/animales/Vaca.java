package animales;

public class Vaca extends Animal {
	
	public Vaca(String nombre, int patas, Persona due�o) {
		super(nombre, patas, due�o);
	}
	
	@Override
	public String emitirSonido() {
		return "MUUUUUUUUUUU";
	}
	
	public String comer() {
		return "Comer hierba";
	}

	@Override
	public void representacion() {
		System.out.println("Soy un gato, me llamo " + this.nombre + ", tengo " + this.patas + " patas, mi due�o es " + this.due�o.getNombre());
	}
}
