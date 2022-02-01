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
		
	}
}
