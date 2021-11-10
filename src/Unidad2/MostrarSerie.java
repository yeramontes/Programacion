package Unidad2;
import java.util.Scanner;
public class MostrarSerie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int numeroColumnas = 3;
		System.out.println("Introduce el primero numero : ");
		while(!sc.hasNextInt()) {
			System.out.println("No es un numero entero, introduce un numero entero : ");
			sc.next();
		}
		int primerNumero = sc.nextInt();
		System.out.println("Introduce el segundo numero : ");
		while(!sc.hasNextInt() && sc.nextInt() <= primerNumero ) {
				System.out.println("No es un numero entero, introduce un numero entero : ");
				sc.next();				
			}
		int segundoNumero = sc.nextInt();
		int contador = primerNumero;
		while(contador <= segundoNumero) {
			System.out.println(contador + "\t");
			contador++;
			int numeroIteraciones = 1;
			if(numeroIteraciones % numeroColumnas == 0 ) {
				System.out.println();
			}
			numeroIteraciones++;
		}
		}
		
}


