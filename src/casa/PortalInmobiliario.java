package casa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;


public class PortalInmobiliario {
	
	private List<Casa> casas = new ArrayList<Casa>();
	
	public void main() {
		Scanner sc = new Scanner(System.in);
		int orden;
		do {
			System.out.println("PORTAL INMOBILIARIO");
			System.out.println("----------------------");
			System.out.println("Ordenar por: ");
			System.out.println("1. Superficie");
			System.out.println("2. Precio");
			System.out.println("3. Numero de habitaciones");
			System.out.println("4. Numero de baños");
			System.out.println("5. Fecha de publicación");
			System.out.println("6. Salir");
			System.out.println();
			orden = sc.nextInt();
		}while(orden < 1 || orden > 6);
		
		if(orden == 6) System.exit(0);
		int direccion = menu2();
		if(direccion == 3) main();
		ordenar(orden, direccion);
		for(Casa c : casas) System.out.println(c.toString());

	}
 
	public int menu2() {
		Scanner sc = new Scanner(System.in);
		int respuesta;
		do {
			System.out.println("En orden: ");
			System.out.println("1. Ascendente");
			System.out.println("2. Descendente");
			System.out.println("3. Volver");
			System.out.println();
			respuesta = sc.nextInt();
		}while(respuesta < 1 || respuesta > 3);
		
		sc.close();
		return respuesta;
		
	}

	public void ordenar(int orden, int direccion) {
		switch(orden) {
		case 1: 
			Collections.sort(casas, new Comparator<Casa>() {

				@Override
				public int compare(Casa c1, Casa c2) {
					int res;
					if(c1.getSuperficie() > c2.getSuperficie()) res = 1;
					if(c1.getSuperficie() < c2.getSuperficie()) res = -1;
					else res = 0;
					return res;
				}
				
			});
			break;
		case 2:
			Collections.sort(casas, new Comparator<Casa>() {

				@Override
				public int compare(Casa c1, Casa c2) {
					int res;
					if(c1.getPrecio() > c2.getPrecio()) res = 1;
					if(c1.getPrecio() < c2.getPrecio()) res = -1;
					else res = 0;
					return res;
				}
				
			});
			break;
		case 3:
			Collections.sort(casas, new Comparator<Casa>() {

				@Override
				public int compare(Casa c1, Casa c2) {
					int res;
					if(c1.getHabitaciones() > c2.getHabitaciones()) res = 1;
					if(c1.getHabitaciones() < c2.getHabitaciones()) res = -1;
					else res = 0;
					return res;
				}
				
			});
			break;
		case 4: 
			Collections.sort(casas, new Comparator<Casa>() {

				@Override
				public int compare(Casa c1, Casa c2) {
					int res;
					if(c1.getBaños() > c2.getBaños()) res = 1;
					if(c1.getBaños() < c2.getBaños()) res = -1;
					else res = 0;
					return res;
				}
				
			});
			break;
		case 5:
			Collections.sort(casas, new Comparator<Casa>() {

				@Override
				public int compare(Casa c1, Casa c2) {
					return c2.getFecha().compareTo(c2.getFecha());
				}
				
			});
			break;
		}
		if(direccion == 2) Collections.reverse(casas);
	}
	
	public void añadirCasa(int superficie, int precio, int habitaciones, int baños) {
		casas.add(new Casa(superficie, precio, habitaciones, baños));
	}
	
	
}
