package banco;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Banco {
	private Map<String, Cuenta> cuentasBancarias;
	
	public Banco() {
		cuentasBancarias = new HashMap();
	}
	
	public void addCuenta(String nombre, int numCuenta, int balance) {
		cuentasBancarias.put(nombre, new Cuenta(nombre, numCuenta, balance));
	}
	
	public Cuenta getCuenta(String nombre) {
		return cuentasBancarias.get(nombre);
	}
	
	public void listarClientes() {
		Set<String> nombres = cuentasBancarias.keySet();
		for(String s : nombres) System.out.println(s);
	}
	
	public void listarMapaKey() {
		Set<String> nombres = cuentasBancarias.keySet();
		for(String s : nombres) {
			System.out.println(cuentasBancarias.get(s).toString());
		}
	}
	
	public void listarMapaEntry() {
		Set<Map.Entry<String, Cuenta>> cuentas = cuentasBancarias.entrySet();
		for(Map.Entry<String, Cuenta> x : cuentas) {
			System.out.println(x.getValue().toString());
		}
	}
}
