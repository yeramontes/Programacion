package Unidad2;

public class Ejer2_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int random = (int)(Math.random() * 100);
		while(random != 5) {
			System.out.println(random);
			random = (int)(Math.random() * 100);
		}
		System.out.println(random);
	}

}
