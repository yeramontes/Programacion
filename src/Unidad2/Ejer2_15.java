package Unidad2;
import java.util.Scanner;
public class Ejer2_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int digitoSumado = 0;
		int total = 0;
		System.out.println("Introduce un numero de varios digitos : ");
		int numero = sc.nextInt();
		while(numero > 0) {
			digitoSumado += numero % 10;
			total =+ digitoSumado;
			numero /= 10;
			
		}
		System.out.println(total);
	}

}
