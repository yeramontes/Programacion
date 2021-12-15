package inversion;

public class SimulacionInversion {
	private static final double INICIAL = 3000;
	private static final double INTERES = 5;
	private static final int A�OS = 5;
	private static Inversion milnversion = new Inversion(INICIAL, INTERES);
	
	public void simularDespuesDe() {
		System.out.println(String.format("%.2f �", milnversion.despuesDe(A�OS)));
	}
	
	public void simularTablaDepuesDe() {
		System.out.println(milnversion.tablaDespuesDe(A�OS));
	}
	
	public void simularHastaObjetivo() {
		System.out.println(milnversion.a�osHastaObjetivo(A�OS));
	}
}
