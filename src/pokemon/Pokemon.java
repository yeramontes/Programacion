package pokemon;

public class Pokemon {
	
	private final int INITIAL_HEALTH = 301;
	private final int INITIAL_STRENGHT = 51;
	private final int INITIAL_SPEED = 201;
	private int health;
	private int strenght;
	private int speed;
	private String name;
	
	public Pokemon() {
		health = ((int)(Math.random()) * INITIAL_HEALTH);
		strenght = ((int)(Math.random()) * INITIAL_STRENGHT);
		speed = ((int)(Math.random()) * INITIAL_SPEED);
		name = "";
	}
	
	public Pokemon(int health, int strenght, int speed, String name) {
		this.health = health;
		this.strenght = strenght;
		this.speed = speed;
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrenght() {
		return strenght;
	}

	public int getSpeed() {
		return speed;
	}	
}
