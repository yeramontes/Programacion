package marioKart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Race {
	private String name;
	private Circuit circuit;
	private final int NUM_KARTS = 3;
	private List<Kart> karts = new ArrayList<Kart>();
	private List<Kart> finishedKarts = new ArrayList<Kart>();
	
	public Race(String name) {
		this.name = name;
	}
	
	public void addKart(Kart kart) {
		this.karts.add(kart);
	}
	
	public void setCircuit(Circuit circuit) {
		this.circuit = circuit;
	}
	
	private boolean notAllFinished() {
		if(karts.size() == 0) return false;
		else return true;
	}
	
	private boolean isFinished(Kart kart) {
		return (kart.getPosition() >= this.circuit.getDistance()) ? true : false;
	}
	
	private void moveToFinished(Kart kart) {
		this.finishedKarts.add(kart);
		this.karts.remove(kart);
	}
	
	private void moveKart(Kart kart) {
		int movedPositions = kart.mover() - circuit.difficulty();
		kart.setPosition(kart.getPosition() + movedPositions);
	}
	
	// AQUI HAY ERROR, AL BORRAR DE LA LISTA NO SE ACTUALIZA EL ITERADOR Y PETA
	// **** ¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡ ARREGLAR !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	// ACORDARSE DE CAMBIAR LA PRIVACIDAD DE LOS METODOS
	
	public void run() {
		while(notAllFinished()) {
			Iterator<Kart> it = karts.iterator();
			while(it.hasNext()) {
				Kart kart = it.next();
				if(isFinished(kart)) { 
					it.remove();
					moveToFinished(kart);}
				else moveKart(kart);
			}
		}
	}
	
	public String showResult() {
		StringBuilder sb = new StringBuilder();
		sb.append("Carrera : ");
		sb.append(name);
		sb.append(" [");
		sb.append("\n\t" + circuit.toString());
		Collections.sort(finishedKarts);
		for(Kart i : finishedKarts) sb.append("\n\t\t" + (finishedKarts.indexOf(i) + 1) + ". " + i.toString());
		sb.append("\n]");
		return sb.toString();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Carrera : ");
		sb.append(name);
		sb.append(" [");
		sb.append("\n\t" + circuit.toString());
		for(Kart i : karts) sb.append("\n\t\t" + (karts.indexOf(i) + 1) + ". " + i.toString());
		sb.append("\n]");
		return sb.toString();
	}
}
