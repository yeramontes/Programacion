package unidad2;
import java.util.Scanner;
public class Ejer2_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero : ");
		int numero = sc.nextInt();
		int contador = 2;
		while(contador < numero) {
			if(numero % contador == 0) {
				System.out.println("El numero no es primo");
				break;
			}
			contador++;
			if(contador == numero) {
				System.out.println("El numero es primo");
			}
		}
		
	}

}
