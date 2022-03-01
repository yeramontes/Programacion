package marioKart;

public class Kart implements Comparable<Kart>{
	private String driver;
	private int speed;
	private int acceleration;
	private int position;
	private int random;
	private final int MAX_POINTS = 18;
	private final int MAX_RANDOM = 6;
	
	public Kart(String driver) {
		this.driver = driver;
		init();
	}
	
	private void init() {
		this.position = 0;
		this.speed = (int)(Math.random() * (MAX_POINTS - 1) + 1);
		this.acceleration = (MAX_POINTS - this.speed);
	}
	
	public int mover() {
		int avance = this.speed + this.acceleration + (int)(Math.random() * MAX_RANDOM + 1);
		int newPosition = avance + this.position;
		this.position = newPosition;
		return avance;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(int acceleration) {
		this.acceleration = acceleration;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}

	public int getMAX_POINTS() {
		return MAX_POINTS;
	}

	public int getMAX_RANDOM() {
		return MAX_RANDOM;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Kart kart = (Kart) obj;
		return this.driver.equals(kart.driver) && (this.speed == kart.speed) &&
		(this.acceleration == kart.acceleration) && (this.position == kart.position);
	}
	
	

	@Override
	public int compareTo(Kart o) {
		// TODO Auto-generated method stub
		Kart aComparar = (Kart) o;
		if(this.speed > aComparar.speed) return -1;
		if(this.speed < aComparar.speed) return 1;
		else return 0;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Kart [driver=");
		builder.append(driver);
		builder.append(", speed=");
		builder.append(speed);
		builder.append(", acceleration=");
		builder.append(acceleration);
		builder.append("]");
		return builder.toString();
	}
	

}
