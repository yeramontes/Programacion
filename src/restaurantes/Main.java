package restaurantes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import Unidad2.pedirNumeroHasta;

public class Main {
	private static List<Restaurante> listaRestaurantes;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opcion;
		leerFichero();
		do {
			System.out.println("1. Añadir restaurante");
			System.out.println("2. Listar");
			System.out.println("3. Buscar por nombre");
			System.out.println("4. Ordenar por ciudad");
			System.out.println("5. Salir");
			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				añadirRestaurante();
				break;
			case 2:
				listar();
				break;
			case 3:
				System.out.println("Introduce la cadena");
				buscarNombre(sc.next());
				break;
			case 4:
				ordenarLista();
				System.out.println("A. Por pantalla");
				System.out.println("B. Por fichero");
				String ab = sc.next();
				if(ab.equals("a")){
					for(Restaurante i : listaRestaurantes) {
						System.out.println(i.toString());
					}
				}else if(ab.equals("b")){
					nuevoFichero();
				}
				break;
			case 5:
				System.exit(0);
			}
		}while(opcion != 5);
	}
	
	public static void añadirRestaurante() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre restaurante:");
		String nombre = sc.nextLine();
		System.out.println("Direccion: ");
		String direccion = sc.nextLine();
		System.out.println("Ciudad: ");
		String ciudad = sc.nextLine();
		System.out.println("Estado: ");
		String estado = sc.nextLine();
		System.out.println("Codigo Postal: ");
		String cPostal = sc.nextLine();
		Restaurante nuevo = new Restaurante(nombre, direccion, ciudad, estado, cPostal);
		listaRestaurantes.add(nuevo);
		try {
			PrintWriter p = new PrintWriter(new BufferedWriter(new FileWriter(new File("restaurantes.csv"), true)));
			p.println(nuevo.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void listar() {
		for(Restaurante i : listaRestaurantes) {
			System.out.println(i.toString());
		}
	}
	
	public static void buscarNombre(String str) {
		for(Restaurante i : listaRestaurantes) {
			if(i.getNombre().contains(str)) System.out.println(i.toString());
		}
	}
	
	public static void ordenarLista() {
		Collections.sort(listaRestaurantes, new Comparator<Restaurante>() {

			@Override
			public int compare(Restaurante o1, Restaurante o2) {
				// TODO Auto-generated method stub
				return o1.getCiudad().compareTo(o2.getCiudad());
			}
			
		});
	}
	
	public static void nuevoFichero() {
		PrintWriter salida = null;
		try {
			salida = new PrintWriter(new BufferedWriter(new FileWriter("src/restaurantes/restaurantesOrdenadosPorCiudad.csv")));
			for(Restaurante i : listaRestaurantes) {
				salida.println(i.toString());
			}
		}catch(IOException e) {
			System.out.println("Peta en la creacion del fichero ordenado");
		} finally {
			salida.close();
		}
	}

	public static void leerFichero() {
		Scanner sc = null;
		try {
			sc = new Scanner(new File("src/restaurantes/restaurantes.csv"));
			if(sc.nextLine().equals("Restaurant,City,Address,State,Zipcode"));
			listaRestaurantes = new ArrayList();
			while(sc.hasNext()) {
				String[] datos = sc.nextLine().split(",");
				String nombre = datos[0];
				String ciudad = datos[datos.length - 3];
				String direccion = "";
				int contador = 1;
				while (contador != datos.length - 3) {
				direccion += datos[contador];
				contador++;
				}
				String estado = datos[datos.length - 2];
				String cPostal = datos[datos.length - 1];
				listaRestaurantes.add(new Restaurante(nombre, ciudad, direccion, estado, cPostal));
			}
		}catch(IOException e) {
			System.out.println("Peta en la lectura del fichero");
			e.printStackTrace();
		}finally {
			sc.close();
		}
	}
}
