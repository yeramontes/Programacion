package pokemon;
import java.util.Scanner;

public class Main {
	
	private static final int NUM_POKEMONS = 5;
	private static Pokemon[] pokemons = new Pokemon[NUM_POKEMONS];
	private static Scanner sc = new Scanner(System.in);
	
	public Main() {
		int opcion;
		do {
			System.out.println();
			System.out.println();
			System.out.println("Elija la opción");
			System.out.println("1. Utilizar los pokemons del juego");
			System.out.println("2. Crear los pokemons aleatoriamente");
			System.out.println("3. Salir");
			System.out.println();
			opcion = sc.nextInt();
			
			if(opcion == 1) {
				initPokemons();
				initCombat();
				
			}else if(opcion == 2) {
				initPokemonsRandomly();
				initCombat();
				
			}else if(opcion == 3){
				System.out.println("Has cerrado el juego.");
				
			}else {
				System.out.println("Opcion incorrecta.");
				
			}
			
		} while(opcion != 3);
		
	}
	
	private static void initPokemons() {
		Pokemon charizard = new Pokemon(100, 50, 50, "Charizard");
		pokemons[0] = charizard;
		Pokemon blastoise= new Pokemon(150, 25, 150, "Blastoise");
		pokemons[1] = blastoise;
		Pokemon venusaur= new Pokemon(300, 10, 100, "Venusaur");
		pokemons[2] = venusaur;
		Pokemon bulbasaur= new Pokemon(250, 20, 180, "Bulbasaur");
		pokemons[3] = bulbasaur;
		Pokemon pikachu= new Pokemon(300, 40, 200, "Pikachu");
		pokemons[4] = pikachu;
	}
	
	private static void initPokemonsRandomly() {
		for(int i = 0; i < pokemons.length; i++) {
			pokemons[i] = new Pokemon();
			pokemons[i].setName("pokemon" + i);
		}
	}
	
	private static void showPokemons() {
		for(int i = 0; i < pokemons.length; i++) {
			System.out.printf("%d. %S ", (i + 1), pokemons[i].getName());
		}
	}
	
	public static void initCombat() {
		showPokemons();
		System.out.println("Escoge el primer Pokemon: ");
		int primerPokemon = sc.nextInt() - 1;
		System.out.println("Escoge el segundo Pokemon: ");
		int segundoPokemon = sc.nextInt() - 1;
		Battle.initBattle(pokemons[primerPokemon], pokemons[segundoPokemon]);
	}
	
	 public static void main(String[] args) {
		Main x = new Main();
	}
}
