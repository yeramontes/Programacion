package pokemon;

public class Battle {
	
	
	public static void initBattle(Pokemon pokemon1, Pokemon pokemon2) {
		
		while(pokemon1.getHealth() > 0 && pokemon2.getHealth() > 0) {
			
			if(pokemon1.getSpeed() > pokemon2.getSpeed()) {
				pokemon2.setHealth(pokemon2.getHealth() - pokemon1.getStrenght());
				pokemon1.setHealth(pokemon1.getHealth() - pokemon2.getStrenght());
				System.out.printf("\n%S comienza el ataque contra %S", pokemon1.getName(), pokemon2.getName());
				System.out.printf("\n%S daña %d a %S y a %S le queda %d vida.", pokemon1.getName(), pokemon1.getStrenght(), pokemon2.getName(), pokemon2.getName(), pokemon2.getHealth());
				System.out.printf("\n%S daña %d a %S y a %S le queda %d vida.", pokemon2.getName(), pokemon2.getStrenght(), pokemon1.getName(), pokemon1.getName(), pokemon1.getHealth());

			}else {
				pokemon1.setHealth(pokemon1.getHealth() - pokemon2.getStrenght());
				pokemon2.setHealth(pokemon2.getHealth() - pokemon1.getStrenght());
				System.out.printf("\n%S comienza el ataque contra %S", pokemon1.getName(), pokemon2.getName());
				System.out.printf("\n%S daña %d a %S y a %S le queda %d vida.", pokemon2.getName(), pokemon2.getStrenght(), pokemon1.getName(), pokemon1.getName(), pokemon1.getHealth());
				System.out.printf("\n%S daña %d a %S y a %S le queda %d vida.", pokemon1.getName(), pokemon1.getStrenght(), pokemon2.getName(), pokemon2.getName(), pokemon2.getHealth());
			}
			
			if(pokemon1.getHealth() <= 0) {
				System.out.printf("\n%S ha perdido el combate", pokemon1.getName());
				
			}else if(pokemon2.getHealth() <= 0) {
				System.out.printf("\n%S ha perdido el combate", pokemon2.getName());
			}
		}
	}
}
