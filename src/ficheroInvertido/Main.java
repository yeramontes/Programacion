package ficheroInvertido;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static List<String> archivo;
	private static StringBuilder resultado; 
	private static String nombre;
	private static String reverseNombre;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fichero = null;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nombre del fichero -> ");
			nombre = sc.nextLine();
			if(!nombre.isEmpty()) {
				fichero = new File("src/ficheroInvertido/" + nombre);
				if(fichero.exists()) {
					nombre = nombre.substring(0, nombre.length() - 4);
					leerFichero(fichero);
					invertirFichero();
					//invertirFicheroAlternativo();
					escribirFichero();
				}
			}
		}while(!nombre.equals("0"));	
	}
	
	private static void invertirFichero() {
		resultado = new StringBuilder();
		reverseNombre = "";
		for(int i = nombre.length() - 1; i >= 0; i--) {
			reverseNombre += nombre.charAt(i);
		}
		
		Collections.reverse(archivo);
		for(String s : archivo) {
			for(int i = s.length() - 1; i >= 0; i--) resultado.append(s.charAt(i));
			resultado.append("\n");
		}
	}
	
	/**
	 * Esta es una forma más "facil" que se me ocurrió. 
	 * No es mas facil realmente pero si que tiene menos posibilidades de fallar.
	 * Ej:
	 * 		En invertirFichero() si te equivocas al igualar las I de los bucles 
	 * 		o al poner el final del bucle el resultado ya no es correcto. 
	 * 		De esta forma aunque sea mas complejo es mas facil de programar.
	 */
	
	private static void invertirFicheroAlternativo() {
		resultado = new StringBuilder();
		List<String> invertido;
		reverseNombre = "";
		for(int i = nombre.length() - 1; i >= 0; i--) {
			reverseNombre += nombre.charAt(i);
		}
		
		Collections.reverse(archivo);
		for(String i : archivo) {
			invertido = Arrays.asList(i.split(""));
			Collections.reverse(invertido);
			for(String j : invertido) {
				resultado.append(j);
			}
			resultado.append("\n");
		}
	}
	
	private static void escribirFichero() {
		PrintWriter impresora = null;
		
		try {
			impresora = new PrintWriter(new BufferedWriter(new FileWriter("src/ficheroInvertido/" + reverseNombre + ".txt" , false)));
			impresora.print(resultado.toString());
		}catch(IOException e) {
			System.out.println("Peta al escribir el fichero");
		}finally {
			impresora.close();
		}

	}
	
	private static void leerFichero(File nombre) {
		Scanner sc = null;
		archivo = new ArrayList();
		try {
			sc = new Scanner(nombre);
		}catch(IOException e) {
			System.out.println("Peta en la lectura del fichero");
		}
		
		while(sc.hasNext()) {
			archivo.add(sc.nextLine());
		}
	}

}
