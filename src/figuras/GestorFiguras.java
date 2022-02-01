package figuras;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestorFiguras {
	private List<Figura> figuras;
	
	public GestorFiguras() {
		figuras = new ArrayList<Figura>();
	}
	
	public void addFigura(Figura f) {
		figuras.add(f);
	}
	
	public void listarFiguras() {
		for(Figura i : figuras) System.out.println(i.toString());
	}
	
	public Figura mayorArea() {
		Figura maxArea = figuras.get(0);
		for(Figura i : figuras) {
			if(i.calcularArea() > maxArea.calcularArea()) maxArea = i;
		}
		return maxArea;
	}
	
	public void borrarColor(Color color) {
		Iterator<Figura> it = figuras.iterator();
		while(it.hasNext()) {
			Figura i = it.next();
			if(i.getColor().equals(color)) it.remove();
		}
	}
	
	public void borrarIgualesA(Figura f) {
		Iterator<Figura> it = figuras.iterator();
		while(it.hasNext()) {
			Figura i = it.next();
			if(i.equals(f)) figuras.remove(i);
		}
	}
}
