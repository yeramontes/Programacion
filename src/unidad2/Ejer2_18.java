package unidad2;

public class Ejer2_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int impares = 0;
		long multiplicaPares = 1;
		int multiplos3y6 = 0;
		int acabanEn7 = 0;		

		int contador = 0;
		int random = (int)(Math.random() * 100);
		
		while(random != 0) {

			if(random == 0) {
				break;
			}
			if(random % 2 != 0) {
				impares += random;
			}
			if(random % 2 == 0) {
				multiplicaPares *= random;
			}
			if(random % 3 == 0  && random % 6 == 0) {
				multiplos3y6++;
			}
			if(random % 10 == 7) {
				acabanEn7++;
			}
			contador++;
			random = (int)(Math.random() * 100);

		}
		System.out.println("Se han generado un total de " + contador + " numeros");
		System.out.println("La suma de los impares ha sido : " + impares);
		System.out.println("La multiplicacion de los numero pares ha sido : " + multiplicaPares);
		System.out.println("Los multiplos de 3 y de 6 han sido : " + multiplos3y6);
		System.out.println("Los que acababan en 7 fueron : " + acabanEn7);
	}

}
