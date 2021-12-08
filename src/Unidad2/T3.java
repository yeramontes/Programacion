package Unidad2;
import java.util.Scanner;
public class T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introdcue una letra : ");
		char letra = sc.next().charAt(0);
		switch(letra) {
		case 'y':
		case 'Y':
			System.out.println("Afirmativo");
			break;
		case 'n':
		case 'N':
			System.out.println("Negativo");
			break;
		default : 
			System.out.println("No es una letra valida!");
			break;
		}
	}

}
