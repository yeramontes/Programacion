package unidad2;
import java.util.Scanner;

public class Ejer2_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el numero de aleatorios");
		int numeroAleatorios = sc.nextInt();
		
		int contador = 1;

		int pares = 0;
		int impares = 0;
		int multiplicacionFin2 = 1;
		while(contador <= numeroAleatorios) {
			float random = (int)(Math.random() * 100);
			if(random % 2 == 0) {
				pares += 1;
			}else {
				impares += random;
			}
			if(random % 10 == 2) {
				multiplicacionFin2 *= random;
			}
			contador++;
			
		}
		System.out.println("El numero de pares es : " + pares);
		System.out.println("La suma de los impares es : " + impares);
		System.out.println("La multiplicacion de los que acaban en 2 es : " + multiplicacionFin2);
		
	}

}
