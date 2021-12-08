package Unidad2;
import java.util.Scanner;
public class notCero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int numero = 0;
		System.out.println("Introduce un numero entero : ");
		while(!sc.hasNextInt()) {
			System.out.println("El numero debe ser un valor entero, intentelo de nuevo : ");
			sc.next();
		}
		numero = sc.nextInt();
		while(numero != 0) {
			total += numero;
			System.out.println("Introduce un numero entero : ");
			numero = sc.nextInt();
		}
		System.out.println("El total es : " + total);
	}

}
