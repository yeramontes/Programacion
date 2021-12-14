package exponenciales;
import java.util.Scanner;

public class AppExponencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("\nDame base para el primer n�mero exponencial: ");
		int base1 = sc.nextInt(); 
		System.out.print("\nDame exponente para el primer n�mero exponencial: ");
		int exponente1 = sc.nextInt();
		
		System.out.print("\nDame base para el segundo n�mero exponencial: ");
		int base2 = sc.nextInt();
		System.out.print("\nDame exponente para el segundo n�mero exponencial: ");
		int exponente2 = sc.nextInt();
		
		Exponencial uno = new Exponencial(base1, exponente1);
		Exponencial dos = new Exponencial(base2, exponente2);
		
		System.out.println("Exponencial 1: ");
		System.out.println(uno.toString());
		System.out.println("Exponencial 2: ");
		System.out.println(dos.toString());
		
		System.out.println("Cociente: ");
		System.out.println(uno.multiplicar(dos).toString());
		System.out.println("Potencia 7 de numero exponencial 1: ");
		System.out.println(uno.elevar(7).toString());
	}

}
