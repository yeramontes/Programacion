package unidad2;

import java.util.Scanner;

public class Ejer2_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int opcionMenu = 0;
		System.out.println("************************");
		System.out.println("El numero actual es : ?");
		System.out.println("************************");
		numero = sc.nextInt();
		do {
			System.out.println("************************");
			System.out.println("El numero actual es : " + numero);
			System.out.println("************************");
			System.out.println("1.- Solicitar numero");
			System.out.println("2.- Factorial");
			System.out.println("3.- Primo");
			System.out.println("4.- Suma cifras");
			System.out.println("5.- Capicúa");
			System.out.println("6.- Salir");
			opcionMenu = sc.nextInt();
			if (opcionMenu >= 1 && opcionMenu <= 6) {
				switch (opcionMenu) {
				case 1:

					if (numero == (int)numero) {
						System.out.println("\n\n\nEl numero es entero\n\n\n");
					}else {
						System.out.println("\n\n\nEl numero no es entero\n\n\n");
					}

					break;

				case 2:

					int contador = 1;
					long resultado = 1;
					while (contador <= numero) {
						resultado *= contador;
						contador++;
					}
					System.out.println("El factorial es : " + resultado);
					break;

				case 3:

					contador = 2;
					boolean esPrimo = true;
					while ((esPrimo) && (contador != numero)) {
						if (numero % contador == 0) {
							esPrimo = false;
							System.out.println("El numero no es primo");
						}
						contador++;
					}
					System.out.println("El numero es primo");
					break;

				case 4:

					resultado = 0;
					while (numero > 0) {
						resultado = numero % 10;
						numero /= 10;
					}
					System.out.println("La suma de sus digitos es " + resultado);
					break;

				case 5:

					int inverso = 0;
					int almacenador = 0;
					resultado = numero;
					while (resultado != 0) {
						almacenador = (int)resultado % 10;
						inverso = (inverso * 10) + almacenador;
						resultado /= 10;
					}
					if (inverso == numero) {
						System.out.println("Es capicua");
					} else {
						System.out.println("No es capicua");
					}
					break;

				case 6:

					System.out.println("Hasta otra....");
					System.exit(0);

				}

			} else {
				System.out.println("Entrada incorrecta");
			}
			opcionMenu = 0;
		} while (true);

	}

}
