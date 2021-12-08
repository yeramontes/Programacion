package Metodos;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int elevacion = sc.nextInt();
		
		System.out.println(eleva(numero, elevacion));
		
		
	}
	
	public static int suma2enteros(int a , int b) {
		return (a + b);
	}
	
	public static int eleva(int c , int d) {
		int resultado = 0; 
		for(int i = 0; i <= d; i++) {
			resultado = (int)(Math.pow(c, i));
		}
		return resultado;
	}
}
