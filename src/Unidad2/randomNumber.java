package Unidad2;
import java.util.Random;
public class randomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		int contador = 1;
		int numero12 = 0;
		numero = (int) (Math.random() * 100) + 1;
		while(numero != 99) {
			if(contador == 30) break;
			System.out.println(numero);
			if (numero == 12) {numero12++;}
			contador++;
			numero = (int) (Math.random() * 100) + 1;
		}
		System.out.println(numero);
		System.out.println("El numero de Doces es : " + numero12);
	}

}
