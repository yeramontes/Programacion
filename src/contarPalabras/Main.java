package contarPalabras;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	private static List<String> archivo;
	private static Map<String, Integer> contadorPalabras;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre del fichero");
		File fichero = new File("src/contarPalabras/" + sc.nextLine());
		leerFichero(fichero);
		separarPalabras();
		resultado();
	}
	
	private static void separarPalabras() {
		if(contadorPalabras == null) contadorPalabras = new TreeMap();
		for(String linea : archivo) {
			String[] palabras = (
					linea.split(" "));
			for(String palabra : palabras) {
				palabra = palabra.toLowerCase();
				try{
					contadorPalabras.computeIfPresent(palabra, (k, v) -> v + 1);
				}catch(ConcurrentModificationException e) {
					System.out.println("Peta al comprobar si la palabra esta en la lista");
				}
				
				if(!contadorPalabras.containsKey(palabra)) contadorPalabras.put(palabra, 1);
			}
		}
	}
	
	private static void getMax() {
		List valores = Arrays.asList(contadorPalabras.values().toArray());
		int max = (int) Collections.max(valores);
		boolean primero = true;
		System.out.println();
		System.out.print("Maximo de ocurrencias: " + max + " (");
		for(Map.Entry<String, Integer> it : contadorPalabras.entrySet()) {
			if(primero && it.getValue() == max) {
				System.out.print(it.getKey() + " ");
				primero = false;
			}else if(it.getValue() == max) {
				System.out.print(", " + it.getKey());
			}
		}
		System.out.print(")");
		
	}
	
	private static void getMin() {
		List valores = Arrays.asList(contadorPalabras.values().toArray());
		int min = (int) Collections.min(valores);
		boolean primero = true;
		System.out.println();
		System.out.print("Minimo de ocurrencias: " + min + " (");
		for(Map.Entry<String, Integer> it : contadorPalabras.entrySet()) {
			if(primero && it.getValue() == min) {
				System.out.print(it.getKey() + " ");
				primero = false;
			}else if(it.getValue() == min) {
				System.out.print(", " + it.getKey());
			}
		}
		System.out.print(")");
		
	}
	
	private static void resultado() {
		for(Map.Entry<String, Integer> iteracion : contadorPalabras.entrySet()) {
			System.out.println(iteracion.getKey() + "\t" + iteracion.getValue());
		}
		getMax();
		getMin();
	}

	
	private static void leerFichero(File fichero) {
		Scanner sc = null;
		try {
			sc = new Scanner(fichero);
			archivo = new ArrayList();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(sc.hasNext()) {
			archivo.add(sc.nextLine());
		}
		sc.close();
	}
}
