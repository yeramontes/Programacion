package Unidad2;
import java.util.Scanner;
public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int entero;
		System.out.println("Escribe un numero entero : ");
		boolean esEntero = sc.hasNextInt();
		while(!esEntero) {
			
			System.out.println("Entrada incorrecta, intentelo de nuevo.");
			sc.next();
			if (sc.hasNextInt()) {
				entero = sc.nextInt();
				for(int i = 1; i <= 10; i++) {
					int multiplicacion = (entero * i);
					System.out.println(entero + " * " + i + " = " + multiplicacion);
				}
				System.exit(0);
			}
		}
		/*entero = sc.nextInt();
		for(int i = 1; i <= 10; i++) {
			int multiplicacion = (entero * i);
			System.out.println(entero + " * " + i + " = " + multiplicacion);
		}*/
		
		
	}

}
