package Unidad2;
import java.util.Scanner;
public class Intervalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Primer numero : ");
		int primerNumero = sc.nextInt();
		System.out.println("Segundo numero : ");
		int segundoNumero = sc.nextInt();
		if(segundoNumero < primerNumero) {
			System.out.println("El segundo numero no puede ser menor que el primero!");
			System.exit(0);
		}
		int contador = primerNumero;
		while(contador <= segundoNumero) {
			System.out.println(contador);
			contador++;
		}
	}

}
