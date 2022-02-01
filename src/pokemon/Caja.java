package pokemon;
import java.util.Scanner;

public class Caja {

	public static void mostrarCajas() {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Coins: " + Main.coins);
			System.out.println();
			System.out.println("\t1. Caja 100c");
			System.out.println("\t2. Caja 250c");
			System.out.println("\t3. Caja 500c");
			System.out.println("\t4. Salir");
			System.out.println("\tEscoja caja...");
			opcion = sc.nextInt();
			while(opcion < 0 || opcion > 3) {
				System.out.println("Opcion incorrecta!");
				System.out.println("Escoja caja...");
				opcion = sc.nextInt();
				
			}
			
			switch(opcion) {
			case 1:
				if(Main.coins >= 100) {
					roll(1);
					Main.coins -= 100;
					break;
					
				}else {System.out.println("Saldo insuficiente!"); break;}
				
			case 2:
				if(Main.coins >= 250) {
					roll(2);
					Main.coins -= 250;
					break;
					
				}else {System.out.println("Saldo insuficiente!"); break;}
				
			case 3:
				if(Main.coins >= 500) {
					roll(3);
					Main.coins -= 500;
					break;
					
				}else {System.out.println("Saldo insuficiente!"); break;}
				
			case 4:
				return;
			}
		}while(true);
		
	}
	
	public static Pokemon roll(int caja) {
		Pokemon rand = new Pokemon();
		switch(caja) {
		case 1:
			rand.setHealth((int)(rand.getHealth() * 1.2));
			rand.setSpeed((int)(rand.getSpeed() * 1.2));
			rand.setStrenght((int)(rand.getStrenght() * 1.2));
			break;
			
		case 2:
			rand.setHealth((int)(rand.getHealth() * 1.4));
			rand.setSpeed((int)(rand.getSpeed() * 1.4));
			rand.setStrenght((int)(rand.getStrenght() * 1.4));
			break;
			
		case 3:
			rand.setHealth((int)(rand.getHealth() * 1.55));
			rand.setSpeed((int)(rand.getSpeed() * 1.55));
			rand.setStrenght((int)(rand.getStrenght() * 1.55));
		}
		
		return rand;
	}
	
	public void changePokemon(Pokemon rand) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Estas son las estadisticas del pokemon: ");
		System.out.println("\t" + rand.toString());
		System.out.println("Deseas sustituir alguno?");
		System.out.println("1. Si\t2. No");
		if(sc.nextInt() == 1) {
			System.out.println("Selecion cual quieres cambiar: ");
			
			
		}
	}
	
}