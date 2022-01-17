package calculadoraNumeros;
/**
 * clase DemomiCalculadoraculadora aquí.
 * 
 * @author 
 * @version 
 */
public class DemoCalculadora
{
    private Calculadora miCalculadora;
    private Calculadora tuCalculadora;

    /**
     * Constructor de la clase DemomiCalculadoraculadora
     */
    public DemoCalculadora()
    {
        miCalculadora = new Calculadora();
        tuCalculadora = new Calculadora();
    }

    public void testUno()
    {
        for(int i = 0; i < miCalculadora.MAX; i++) {
        	int x = (int)(Math.random() * 999) + 1;
        	miCalculadora.introducirNumero(x);
        	
        }
        miCalculadora.escribirNumeros();
        System.out.println();
        int[] x = miCalculadora.todoDigitosDecreciente();
        for(int i = 0; i < x.length; i++) {
        	System.out.print(x[i] + " ");
        }
        System.out.println();
        miCalculadora.borrarUltimoElemento();
        miCalculadora.escribirNumeros();
        System.out.println();
        miCalculadora.borrarPares();
        miCalculadora.escribirNumeros();
        System.out.println();
    }

    public void testDos()
    {
    	for(int i = 0; i < 8; i++) tuCalculadora.introducirNumero(2 * i);
    	tuCalculadora.escribirNumeros();
    	System.out.println();
    	int[] x = tuCalculadora.getNumeros();
    	for(int i = 0; i < 8; i++) {
    		if(x[i] > 6) System.out.print(x[i] + " ");
    	}
    	System.out.println();
    	for(int i = 0; i < 3; i++) tuCalculadora.borrarUltimoElemento();
        tuCalculadora.escribirNumeros();
        System.out.println();
        System.out.println("Quedan " + tuCalculadora.getTotal() + " valores");
        System.out.println();
        tuCalculadora.vaciar();
        System.out.println("Quedan " + tuCalculadora.getTotal() + " valores");
    }

    public void testTres()
    {
    	miCalculadora.insertarEnPosicion(7, 0);
        miCalculadora.insertarEnPosicion(9, 1);
        miCalculadora.insertarEnPosicion(1, 2);
        miCalculadora.escribirNumeros();
        miCalculadora.insertarEnPosicion(25, 33);
    }
}