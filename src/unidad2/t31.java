package unidad2;
import java.util.Scanner;
public class t31 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero : ");
		if(sc.hasNextInt()) {
			int valorUno = sc.nextInt();
			System.out.println("Introduce otro numero : ");
			if(sc.hasNextInt()) {
				int valorDos = sc.nextInt();
				System.out.println("Introduce una letra : ");
				char caracter = sc.next().charAt(0);
				switch(caracter) {
				case 'S':
				case 's':
					System.out.println("Suma = " + (valorUno + valorDos));
					break;
				case 'R':
				case 'r':
					System.out.println("Resta = " + (valorUno - valorDos));
					break;
				case 'M':
				case 'm': 
					System.out.println("Multiplicacion = " + (valorUno * valorDos));
					break;
				case 'D':
				case 'd':
					if(valorDos != 0) {
						System.out.println("División = " + (valorUno / valorDos));
					}else {
						System.out.println("No se puede dividir entre 0");
					}
					break;
				default:
					System.out.println("Operacion no encontrada");
				}
			}else{
				System.out.println("Entrada incorrecta");
			}
		}else{
			System.out.println("Entrada incorrecta");
		}
		
	}
}
