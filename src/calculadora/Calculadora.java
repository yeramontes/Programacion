package calculadora;

import java.io.IOException;
import java.util.Scanner;


public class Calculadora {
	private double atrib1;
	private double atrib2;
	private char operador;
	private double resultado;
	private static final char[] OPERADORES = {'+', '-', '*', '/'};
	
	
	
	public double getAtrib1() {
		return atrib1;
	}

	public double getAtrib2() {
		return atrib2;
	}

	public char getOperador() {
		return operador;
	}

	public double getResultado() {
		return resultado;
	}

	public double sumar() {
		return atrib1 + atrib2;
	}
	
	public double restar() {
		return atrib1 - atrib2;
	}
	
	public double multiplicar() {
		return atrib1 * atrib2;
	}
	
	public double dividir() {
		return atrib1 / atrib2;
	}
	
	public void leerOperandos(String str) throws IOException {
		if(str.equals("salir")) System.exit(0);
		String[] valores = str.split(" ");
		if(valores.length > 2) throw new IOException("No has introducido parametros correctos");
		try {
			this.atrib1 = Double.parseDouble(valores[0]);
			this.atrib2 = Double.parseDouble(valores[1]);
		}catch(NumberFormatException e) {
			System.out.println("Los valores introducidos no son validos.");
		}
	}
	
	public void leerOperador(String str) throws ExcepcionOperadorInvalido {
		char c = str.trim().charAt(0);
		for(char i : OPERADORES) {
			if(i == c) {
				operador = c;
				return;
			}
		}
		throw new ExcepcionOperadorInvalido();
	}
	
	public void realizarOperacion() throws DivisionPorCeroException {
		switch(operador) {
		case '+':
			resultado = atrib1 + atrib2;
			break;
		case '-':
			resultado = atrib1 - atrib2;
			break;
		case '*':
			resultado = atrib1 * atrib2;
			break;
		case '/':
			if(atrib2 == 0) {
				throw new DivisionPorCeroException();
			}else {
				resultado = atrib1 / atrib2;
			}
		}
	}
	
	public void mostrarResultado() {
		System.out.println(atrib1 + " " + operador + " " + atrib2 + " = " + resultado);
	}
}
