package unidad2;
import java.util.Scanner;
public class Ejer2_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero : ");
		int numeroMultiplicador = sc.nextInt();
		int numero2 = 1;
		int contador = 1;
		while(contador <= numeroMultiplicador) {
			System.out.println("------------");
			System.out.println("Tabla del " + contador);
			System.out.println("------------");
			while(numero2 <= 10) {
				System.out.println(contador + " * " + numero2 + " = " + (contador * numero2));
				numero2++;
			}
			numero2 = 1;
			contador++;
		}
	}

}
