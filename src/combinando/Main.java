package combinando;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static List<String> resultado = new ArrayList();
	private static List<String> ficheroUno = new ArrayList();
	private static List<String> ficheroDos = new ArrayList();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leerFicheros();
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("1. Combinar ficheros");
			System.out.println("2. Combinar ordenados");
			System.out.println("3. Salir");
			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				combinar();
				resultado("resultado.txt");
				break;
			case 2:
				combinarOrdenados();
				resultado("salida-ordenada.txt");
				break;
			case 3: 
				System.exit(0);
				break;
			default:
					System.out.println("Opcion no valida");
			}
		}while(opcion != 3);
		
	}
	
	private static void leerFicheros() {
		Scanner f1 = null;
		Scanner f2 = null;
		try {
			f1 = new Scanner(new File("src/combinando/planetas.txt"));
			while(f1.hasNext()) {
				ficheroUno.add(f1.nextLine());
			}
		}catch(IOException e) {
			System.out.println("Peta al leer el primer fichero");
		}finally {
			f1.close();
		}
		
		try {
			f2 = new Scanner(new File("src/combinando/frutas.txt"));
			while(f2.hasNext()) {
				ficheroDos.add(f2.nextLine());
			}
		}catch(IOException e) {
			System.out.println("Peta al leer el segundo fichero");
		}
	}

	private static void combinar() {
		int linea = 0;
		while(resultado.size() != (ficheroUno.size() + ficheroDos.size())) {
			if(linea < ficheroUno.size()) resultado.add(ficheroUno.get(linea));
			if(linea < ficheroDos.size()) resultado.add(ficheroDos.get(linea));
			linea++;
		}
	}
	
	private static void combinarOrdenados() {
		combinar();
		Collections.sort(resultado);
	}
	
	private static void resultado(String ruta) {
		PrintWriter p = null;
		try {
			p = new PrintWriter(new BufferedWriter(new FileWriter(new File("src/combinando/" + ruta), false)));
			for(String s : resultado) {
				p.println(s);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Peta al escribir el resultado");
		}finally {
			p.close();
		}
	}
}
