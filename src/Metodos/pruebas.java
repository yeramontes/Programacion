package Metodos;
import java.util.Scanner;
public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int numero = sc.nextInt();
		boolean haAprobado = true;
		char curso = sc.next().charAt(0);
		if(curso == 's' || curso == 'S') {
			if(haAprobado) {
				System.out.println("El alumno hara la FCT");
			}
		}else {
			System.out.println("Final de este metodo");
		}
		
	}
}
