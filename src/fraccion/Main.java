package fraccion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoFraccion test = new DemoFraccion();
		/*
		 * test.demo1(); test.demo2(); DemoFraccion test2 = new DemoFraccion();
		 * test2.demo2(); test2.demo1();
		 */
		Fraccion x = new Fraccion();
		
		System.out.println(x.mcd(2366, 273));
		
		///Ocurre el error porque en el metodo demo2, el objeto todabia no esta creado.
	}

}
