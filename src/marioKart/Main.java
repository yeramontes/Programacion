package marioKart;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Race race = new Race("Super Cup");
		Kart luigi = new Kart("Luigi");
		race.addKart(luigi);
		race.addKart(new Kart("Bowser"));
		race.addKart(new Kart("Mario"));
		race.setCircuit(new Circuit("Mina de Wario", 20));

		
		  System.out.println("**** Init Super Mario kart ****");
		  System.out.println(race.toString()); race.run();
		  System.out.println("**** Game Over ****");
		  System.out.println(race.showResult());
		 
	}

}
