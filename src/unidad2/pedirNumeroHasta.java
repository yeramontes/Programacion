package unidad2;
import java.util.Scanner;
public class pedirNumeroHasta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int numero = sc.nextInt();
		while (numero != 0) {
			System.out.println("Numero incorrecto !");
			numero = sc.nextInt();
		}
		System.out.println("Numero correcto");
	}

}
