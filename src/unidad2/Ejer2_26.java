package unidad2;
import java.util.Scanner;

public class Ejer2_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica cuantos numeros quieres que se generen(Max: 100");
		int numeroAleatorios = sc.nextInt();
		int random = (int)(Math.random() * 99) + 1;
		int numeroMaximo = 0;
		for(int contador = 0; contador <= numeroAleatorios; contador++) {
			System.out.print(random + "\t");
			if(random >= numeroMaximo) {
				numeroMaximo = random;
			}
			random = (int)(Math.random() * 99) + 1;
		}
		System.out.println();
		System.out.println("El numero maximo ha sido el " + numeroMaximo);
	}

}
