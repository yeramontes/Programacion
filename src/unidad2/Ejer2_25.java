package unidad2;

public class Ejer2_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random = (int)(Math.random() * 49) + 1;
		int pares = 0;
		int impares = 0;
		for(int contador = 1; contador <= 20; contador++) {
			System.out.print(random + "\t");
			if(random % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
			random = (int)(Math.random() * 49) + 1;
		}
		System.out.println();
		System.out.println("El total de numero pares es " + pares);
		System.out.println("El total de numeros impares es " + impares);
	}

}
