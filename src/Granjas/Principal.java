package Granjas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Granjero yerai = new Granjero("yerai" , "montes" , 20 , 'h');
		System.out.println(yerai);
		
		Granja progra = new Granja(yerai , "yerai" , "oviedo");
		System.out.println("\n" + progra);
		
		Mascota mascota = new Mascota("perro" , 7 , "4Ptas");
	}

}
