package Unidad2;
import java.util.Scanner;
public class Ejer2_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero : ");
		int numero = sc.nextInt();
		int contador = 1; 
		int numeroIteraciones = 0;
		
		while(contador <= numero) {
	
			System.out.print(contador + " ");
			numeroIteraciones++;
			
			if(numeroIteraciones == contador) {
				System.out.println();
				contador++;
				numeroIteraciones = 0;
			}
		}
	}
}
