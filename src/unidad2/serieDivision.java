package unidad2;
import java.util.Scanner;
public class serieDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float suma = 0.0f;
		System.out.println("Introduce un numero  : ");
		int numero = sc.nextInt(); 
		int contador = 1;
		while(contador != numero) {
			float division = (1 / contador);
			suma += division;
			System.out.println("1 / " + contador);
			contador++;
		}
		System.out.println("La suma total es de : " + suma);
	}

}
