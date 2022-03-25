package casinos;

public class LasVegas {
	private Casino[] casinos;
	private int posicion;
	
	public LasVegas() {
		casinos = new Casino[10];
		posicion = 0;
		insertarCasino(new Casino("Cesars Palace", 500, 10, "Americana", 10, true));
		insertarCasino(new Casino("Flamingo", 1500, 30, "Europea", 20, true));
		insertarCasino(new Casino("Luxor", 700, 15, "Americana", 5, false ));
		insertarCasino(new Casino("The Mirage", 5000, 50, "Europea", 20, true));
		insertarCasino(new Casino("Bellagio", 200, 1, "Americana", 15.95, false));
	}
	
	public void insertarCasino(Casino casino) {
		this.casinos[posicion] = casino;
		posicion++;
	}

	public Casino[] getCasinos() {
		return casinos;
	}

	public Casino[] getCasinos(Casino[] casinos) {
		return casinos;
	}
	
	
}
