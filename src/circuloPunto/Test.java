package circuloPunto;

public class Test {

	public void test() {
		Punto p1 = new Punto(3, 8);
		Punto p2 = new Punto(12, 9);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p1.getDistanciaDesdeOrigen());
		System.out.println(p2.getDistanciaDesdeOrigen());
		System.out.println(p1.getDistaniaDesde(p2));
	}

}
