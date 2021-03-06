package dado;

public class DemoDado {
	public Dado dado;
	public static int TOTAL = 10;
	
	public DemoDado() {
		dado = new Dado();
	}
	
	public void test1() {
		int apariciones = 0;
		for(int i = 1; i <= TOTAL; i++) {
			System.out.println(dado.lanzar());
			if(dado.getValor() == 1 || dado.getValor() == 6) apariciones++; 
		}
		System.out.printf("\nNumero de veces que aparecen el 1 o el 6: %d\n", apariciones);
	}
	
	public void test2() {
		int tiradas = 0;
		dado.lanzar();
		while(dado.getValor() != 4 && dado.getValor() != 5) {
			tiradas++;
			System.out.print(dado.lanzar());
		}
		System.out.println();
		System.out.println("Numero de tiradas " + tiradas);
	}
	
	public void test3() {
		int sumaTiradas = 0;
		while(sumaTiradas <= 42) {
			sumaTiradas += dado.lanzar();
			System.out.print(dado.getValor());
		}
	}
}
