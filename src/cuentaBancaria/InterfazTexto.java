package cuentaBancaria;
import java.util.Scanner;

public class InterfazTexto {
	private static final int INGRESO = 1;
	private static final int REINTEGRO = 2;
	private static final int CONSULTA = 3;
	private static final int IMPRIMIR = 4;
	private static final int SALIR = 5;
	private Cuenta cuenta;
	private Scanner teclado;
	
	public InterfazTexto() {
		teclado = new Scanner(System.in);
	}
	
	public void Iniciar() {
		System.out.println("Nº de cuenta: ");
		int nCuenta = teclado.nextInt();
		System.out.println("Nombre titular: ");
		String titular = teclado.next();
		cuenta = new Cuenta(nCuenta, titular);
		while(true) {
			switch(menu()) {
			case INGRESO:
				realizarIngreso();
				break;
			case REINTEGRO:
				realizarReintegro();
				break;
			case CONSULTA:
				consultarSaldo();
				break;
			case IMPRIMIR:
				imprimirDatosCuenta();
				break;
			case SALIR:
				System.out.println('\u000c');
				System.exit(0);
			}
		}
	}
	
	public int menu(){
		System.out.println();
		System.out.println("1.- Ingreso");
		System.out.println("2.- Reintegro");
		System.out.println("3.- Consulta");
		System.out.println("4.- Imprimir datos cuenta");
		System.out.println("5.- Salir");
		System.out.println("Elija opcion: ");
		return teclado.nextInt();
	}
	
	public void realizarIngreso() {
		System.out.println("Cantidad a ingresar: ");
		cuenta.ingresar(teclado.nextDouble());
	}
	
	public void realizarReintegro() {
		System.out.println("Cantidad a sacar: ");
		cuenta.reintegrar(teclado.nextDouble());
	}
	
	public void consultarSaldo() {
		System.out.printf("\nEl saldo de la cuenta es de : %.02f" , cuenta.getSaldo());
	}
	
	public void imprimirDatosCuenta() {
		System.out.println(cuenta.toString());
	}
}
