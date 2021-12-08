package Unidad2;

import java.util.Scanner;
public class Ejer2_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero : ");
		int numero = sc.nextInt();
		int filas = 1;
		int contador = 1;
		int columnas = 0;
		
		while(filas <= numero) {
	
			System.out.print(contador + " ");
			columnas++;
			contador++;
			if(columnas == filas) {
				System.out.println();
				columnas = 0;
				contador = 1;
				filas++;
			}
		}
	}
}
