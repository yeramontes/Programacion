package Unidad2;
import java.util.Scanner;
public class Ejer2_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de numeros aleatorios : ");
		int cantidadAleatorios = sc.nextInt();
		int random = (int)(Math.random() * 100); 
		int contador = 1;
		int sumatorio = 0;
		int division = random;
		int contador2 = 0;
		while(contador <= cantidadAleatorios) {
/*			while(division % 10 != 0) {
				sumatorio += division % 10;
				division /= 10;
			}
*/
			while(contador2 <= division) {
				sumatorio += contador2;
				contador2++;
			}
			contador2 = 0;
			System.out.println("Sumatorio de " + random + " = " + sumatorio);
			sumatorio = 0;
			random = (int)(Math.random() * 100);
			division = random;
			contador++;
		}
	}

}
