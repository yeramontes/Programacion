package Metodos;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de veces que quieres q se ejecute >");
		int numerVeces = sc.nextInt();
		fibonacci(numerVeces);
		
	}
	public static void fibonacci(int a) {
			
		int primerNumero = 0;
		int segundoNumero = 1;
		int resultado = primerNumero;
		//System.out.println(primerNumero + "\t" + segundoNumero + "\t");
		for(int i = 0;i < a; i++) {
			System.out.print(resultado + "\t");
			primerNumero = segundoNumero;
			segundoNumero = resultado;
			resultado = primerNumero + segundoNumero;
		}
		
	}
	
}

