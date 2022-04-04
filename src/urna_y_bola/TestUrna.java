package urna_y_bola;

import java.util.Scanner;

public class TestUrna {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Urna urna = new Urna();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de bolas a introducir en la urna");
		int numeroBolas = sc.nextInt();
		for(int i = 0; i < numeroBolas; i++) {
			urna.meterBola(new Bola());
		}
		System.out.println(urna.sacarBola().toString());
		System.out.println(urna.cuantasBlancas());
		System.out.println(urna.cuantasNegras());
		urna.mostrarUrna();
		urna.borrarBlancas();
		urna.mostrarUrna();
	}

}
