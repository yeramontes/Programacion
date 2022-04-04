package urna_y_bola;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Urna {
	private List<Bola> urna;
	
	public Urna() {
		urna = new ArrayList();
	}
	
	public void meterBola(Bola b) {
		urna.add(b);
	}
	
	public Bola sacarBola() throws Exception {
		if(urna.isEmpty()) {
			throw new Exception("La urna esta vacia");
		}else {
			Bola b = urna.get(obtenerPosicionAleatoria(urna.size()));
			urna.remove(b);
			return b;
		}
		
	}
	
	private int obtenerPosicionAleatoria(int hasta) {
		Random rd = new Random();
		return rd.nextInt(hasta);
	}	
	
	public int cuantasBlancas() {
		int blancas = 0;
		for(Bola b : urna) {
			if(b.esBlanca()) blancas++;
		}
		return blancas;
	}
	
	public int cuantasNegras() {
		int negras = 0;
		for(Bola b : urna) {
			if(b.esNegra()) negras++;
		}
		return negras;
	}
	
	public void mostrarUrna() {
		System.out.println("Urna [");
		Iterator<Bola> it = urna.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		System.out.println("]");
	}
	
	public void borrarBlancas() {
		Iterator<Bola> it = urna.iterator();
		while(it.hasNext()) {
			if(it.next().esBlanca()) it.remove();
		}
	}
}
