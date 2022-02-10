package pkgaeropuerto.modelo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Iterator;

public class Aeropuerto{

	private List<Aerolinea> aeroli;

	public Aeropuerto() {
		aeroli = new ArrayList<Aerolinea>();
	}

	/**
	 * Añade un vuelo a la aerolinea correspondiente solo en el caso de que el vuelo
	 * no estuviese ya introducido, si la aerolinea no existiese se añade tanto la
	 * aerolinea como el vuelo.
	 */
	public void addVuelo(String aerolinea, Vuelo vuelo) {
		for(Aerolinea x : aeroli) {
			if(x.getNombre().equals(aerolinea)) { x.addVuelo(vuelo) ; return;}
		}
		for(Aerolinea x : aeroli) {
			for(Vuelo i : x.getArrayList()) {
				if(i.equals(vuelo)) return;
			}
			x.addVuelo(vuelo);
		}
		aeroli.add(new Aerolinea(aerolinea, vuelo));
	}

	/**
	 * Imprime los vuelos por cada aerolinea ordenados por destino, tanto aerolineas
	 * como vuelos estaran ordenados alfabeticamente (Ver resultados de ejecucion)
	 */
		
	public void ordenAerolineasAlfabetico() {
		Collections.sort(aeroli);
		for(Aerolinea x : aeroli) System.out.println(x.toString());
	}

	/**
	 * Muestra los vuelos regulares de la aerolinea pasada por parametro, se
	 * visualizaran de mayor a menor segun el numero de plazas
	 * 
	 * @param aerolinea
	 *            Aerolinea de la que se imprimiran los vuelos regulares
	 */
	public void regularPorPlazas(String aerolinea) {
		List<Vuelo> vuelos = null;
		List<Regular> regulares = new ArrayList<Regular>();
		for(Aerolinea i : aeroli) {
			if(i.getNombre().equals(aerolinea)) {
				vuelos = i.getArrayList();
			}
		}
		
		for(Vuelo i : vuelos) {
			if(i instanceof Regular) regulares.add((Regular)i);
		}
		
		Collections.sort(regulares, new Comparator<Regular>() {

			public int compare(Regular v1 , Regular v2) {
				if(v1.getPlazasLibres() > v2.getPlazasLibres()) return 1;
				else if(v1.getPlazasLibres() < v2.getPlazasLibres()) return -1;
				else return 0;
			}
		});
		
		for(Regular x : regulares) System.out.println(x.toString());
	}

	/**
	 * Devuelve una lista con vuelos regulares con plazas libres
	 * 
	 * @return aerolina Aerolina del avion charter con más capacidad
	 */
	public List<Vuelo> plazasLibres() {
		List<Vuelo> conPlazas = new ArrayList<Vuelo>();
		for(Aerolinea x : aeroli){
			List<Vuelo> v = x.getArrayList();
			for(Vuelo i : v) {
				if(i instanceof Regular) {
					if(((Regular) i).getPlazasLibres() > 0) conPlazas.add(i);
				}
			}
		}
		return conPlazas;
	}

	/**
	 * Muestra el numero de vuelos de cada aerolinea que llegan al destino pasado
	 * por parametro, ver resultados de ejecucion
	 * 
	 * @param destino
	 *            Destino del que se debe sacar la estadistica
	 */
	public void estadisticaDestino(String destino) {
		for(Aerolinea i : aeroli) {
			int numeroVuelos = 0;
			List<Vuelo> vuelos = i.getArrayList();
			for(Vuelo x : vuelos) {
				if(x.getDestino().equals(destino)) numeroVuelos++;
			}
			System.out.printf("\nLa aerolinea %S cuenta con %d vuelo con destino %S." , i.getNombre(), numeroVuelos, destino);
		}
	}

	/**
	 * Borra los vuelos reservados por una empresa y devuelve el numero de vuelos
	 * borrados, utiliza un conjunto de entradas
	 * 
	 * @param nifEmpresa
	 * @return numero de vuelos borrados
	 */
	public int borrarVuelosEmpresa(String nifEmpresa) {
		int numBorrados = 0;
		for(Aerolinea i : aeroli) {
			List<Vuelo> vuelos = i.getArrayList();
			Iterator<Vuelo> it = vuelos.iterator();
			while(it.hasNext()) {
				Vuelo v = it.next();
				if(v instanceof Charter && ((Charter) v).getNifString().equals(nifEmpresa)) {
					vuelos.remove(v);
					numBorrados++;
				}
			}
			i.setVuelos(vuelos);
		}
		return numBorrados;
	}

	/**
	 * Imprime la lista de vuelos pasada por parametro
	 * 
	 * @param listaVuelos
	 */
	public void imprimirListaVuelos(List<Vuelo> listaVuelos) {
		for(Vuelo i : listaVuelos) {
			if(i instanceof Regular)System.out.println(((Regular) i).toString());
			if(i instanceof Charter) System.out.println(((Regular) i).toString());
			else System.out.println(i.toString());
		}
	}

	/**
	 * Represetación textual del mapa tal y como se muestra en el enunciado
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Aerolinea i : aeroli) sb.append(i.toString());
		return sb.toString();
	}

	/**
	 * Rellena el mapa haciendo uso de un fichero de texto
	 */
	public void leerFicheroCursos() {
		Scanner entrada = null;
		try {
			entrada = new Scanner(this.getClass().getResourceAsStream("aviones.txt"));
			while (entrada.hasNextLine()) {
				String linea = entrada.nextLine();
				int pos = linea.indexOf(":");
				String aerolinea = linea.substring(0, pos);
				String[] vuelo = linea.substring(pos + 1).split(":");
				String destino = vuelo[1];
				String avion = vuelo[2];
				int plazas = Integer.parseInt(vuelo[3].trim());
				if (vuelo[0].equals("R")) {
					int plazasLibres = Integer.parseInt(vuelo[4].trim());
					this.addVuelo(aerolinea, new Regular(destino, avion, plazas, plazasLibres));
				}
				else {
					String nifEmpresa = vuelo[4];
					this.addVuelo(aerolinea, new Charter(destino, avion, plazas, nifEmpresa));
				}
			}

		}

		finally {
			try {
				entrada.close();
			}
			catch (NullPointerException e) {
				System.out.println("Error en IO , no se ha creado el fichero");
			}
		}

	}
}
