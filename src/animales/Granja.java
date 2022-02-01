package animales;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Granja {

	private List<Animal> granja;
	
	public Granja() {
		this.granja = new ArrayList<Animal>();
	}
	
	public void addAnimal(Animal animal) {
		granja.add(animal);
	}
	
	public void mostrarAnimales() {
		for(Animal i : granja) i.representacion();
	}
	
	public Animal getAnimal(int posicion) {
		return granja.get(posicion);
	}
	
	public int cuantosPerros() {
		int perros = 0;
		for(Animal i : granja) {
			if(i instanceof Perro) perros++;
		}
		return perros;
	}
	
	public void borrarGatos() {
		Iterator<Animal> x = granja.iterator();
		while(x.hasNext()) {
			if(x.next() instanceof Gato) x.remove();
		}
	}
}
