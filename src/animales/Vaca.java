package animales;

public class Vaca extends Animal {
	
	public Vaca(String nombre, int patas, Persona dueño) {
		super(nombre, patas, dueño);
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
