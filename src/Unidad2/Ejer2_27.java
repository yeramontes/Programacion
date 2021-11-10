package Unidad2;

public class Ejer2_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota = (int) (Math.random() * 9) + 1;
		float media = 0f;
		int notaMaxima = 0;
		int notaMinima = 10;
		int vecesMaxima = 0;
		int vecesMinima = 0;
		for(int contador = 1; contador <= 30; contador++) {
			media += nota;
			System.out.println(nota);
			
			if(nota > notaMaxima) {
				notaMaxima = nota;
				vecesMaxima = 0;
			}
			if(nota < notaMinima) {
				notaMinima = nota;
				vecesMinima = 0;
			}
			if(nota == notaMaxima) {
				vecesMaxima++;
			}
			if(nota == notaMinima) {
				vecesMinima++;
			}
			nota = (int) (Math.random() * 9) + 1;
		}
		media /= 30;
		System.out.println("La nota media es de : " + media);
		System.out.println("La nota maxima es de  : " + notaMaxima + "; Ha salido un total de " + vecesMaxima );
		System.out.println("La nota minima es de : " + notaMinima + "; Ha salido un total de " + vecesMinima);
	}

}
