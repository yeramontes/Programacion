package inversion;

public class SimulacionInversion {
	private static final double INICIAL = 3000;
	private static final double INTERES = 5;
	private static final int AÑOS = 5;
	private static Inversion milnversion = new Inversion(INICIAL, INTERES);
	
	public void simularDespuesDe() {
		System.out.println(String.format("%.2f €", milnversion.despuesDe(AÑOS)));
	}
	
	public void simularTablaDepuesDe() {
		System.out.println(milnversion.tablaDespuesDe(AÑOS));
	}
	
	public void simularHastaObjetivo() {
		System.out.println(milnversion.añosHastaObjetivo(AÑOS));
	}
}
