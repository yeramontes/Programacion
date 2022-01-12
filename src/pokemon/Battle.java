package pokemon;

public class Battle {
	
	
	public static void initBattle(Pokemon pokemon1, Pokemon pokemon2) {
		
		Pokemon primero = null;
		Pokemon segundo = null;
		
		if(pokemon1.getHealth() <= 0) { System.out.println("\nNo puedes escoger este pokemon, debe reposar."); return;}
		
		while(pokemon1.getHealth() > 0 && pokemon2.getHealth() > 0) {			
			if(pokemon1.getSpeed() > pokemon2.getSpeed()) {
				primero = pokemon1;
				segundo = pokemon2;

			}else {
				primero = pokemon2;
				segundo = pokemon1;
				
			}
			
			System.out.printf("\n%S comienza el ataque contra %S", primero.getName(), segundo.getName());
			segundo.setHealth(segundo.getHealth() - primero.getStrenght());
			System.out.printf("\n%S daña %d a %S y a %S le queda %d vida.", primero.getName(), primero.getStrenght(), segundo.getName(), segundo.getName(), segundo.getHealth());
			

			if(segundo.getHealth() > 0) {
				primero.setHealth(primero.getHealth() - segundo.getStrenght());
				System.out.printf("\n%S daña %d a %S y a %S le queda %d vida.", segundo.getName(), segundo.getStrenght(), primero.getName(), primero.getName(), primero.getHealth());
				
			}
		}
		
		if(primero.getHealth() <= 0) {
			System.out.println();
			System.out.println(primero.getName() + " ha perdido el combate");
			if(primero == pokemon1) primero.setName(primero.getName() + "(Descansando)");;
			
		}else{
			System.out.println();
			System.out.println(segundo.getName() + " ha perdido el combate");
			if(segundo == pokemon1) segundo.setName(segundo.getName() + "(Descansando)");;
		}
		
	}
}
