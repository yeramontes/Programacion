package preprocesador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static List<String> archivo;
	private static String nombre;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Preprocesadorde comentarios en Java");
			System.out.println("------------------------------------");
			System.out.println("1. Eliminar comentarios");
			System.out.println("2. Salir");
			opcion = sc.nextInt();
			if (opcion == 1) {
				eliminar();
			} else if (opcion == 2) {
				System.exit(0);
			}else {
				System.out.println("Opcion invalida");
			}
		} while (opcion != 2);
	}
	
	private static void eliminar() {
		Scanner sc = new Scanner(System.in);
		File fichero = null;
		System.out.println("introduzca el nombre del fichero a tratar > ");
		nombre = sc.nextLine();
		try {
			fichero = new File("src/preprocesador/" + nombre);
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("No puedes introducir este campo en blanco");
		}
		if(fichero.exists()) {
			leerFichero(fichero);
			
		}else {
			System.out.println("El nombre introducido no coincide con ningun fichero existente");
			return;
		}
		
		boolean bloque = false;
		Iterator<String> it = archivo.iterator();
		while(it.hasNext()) {
			String fila = it.next();
			if(!fila.isEmpty()) {
				
				if(fila.contains("//")) {
					if(fila.substring(0, fila.indexOf("//")).trim().isEmpty()){
						it.remove();
					}else archivo.set(archivo.indexOf(fila), fila.substring(0, fila.indexOf("//")));
				}
				if(fila.contains("*/")) {
					it.remove();
					bloque = false;
				}
				if(bloque) it.remove();
				if(fila.contains("/*")) {
					bloque = true;
					it.remove();
				}
			}else if(!fila.isEmpty() && bloque) it.remove();

		}
		escribirFichero();
	}
	
	private static void escribirFichero() {
		PrintWriter p = null;
		try {
			p = new PrintWriter(new BufferedWriter(new FileWriter(new File("src/preprocesador/out.java"))));
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Falla al escribir el archivo");
		}
		
		for(String s : archivo) p.println(s);
		p.close();
	}
	
	private static void leerFichero(File nombre) {
		
		Scanner scan = null;
		try {
			scan = new Scanner(nombre);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		archivo = new ArrayList();
		while(scan.hasNext()) {
			archivo.add(scan.nextLine());
		}
		scan.close();
	}
}
