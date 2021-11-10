package Metodos;

/**
 * Esta clase contiene algunos métodos con usos de la sentencia condicional if y
 * switch
 * 
 */
public class Tarea4 {

	/**
	 * Punto de entrada de la ejecución.
	 */
	public static void main(String[] args) {
		Tarea4 ej = new Tarea4();
		ej.printDescripcion(54, "Ramiro");
		ej.printDescripcionOtraVersion(17, "Jonathan");
		ej.printDescripcion(12, "Marco");

		System.out.println(ej.esPositivoPar(3));
		System.out.println(ej.esPositivoPar(34));

		System.out.println(ej.metodoMisterioV1(34));
		System.out.println(ej.metodoMisterioV2(-34));
		System.out.println(ej.metodoMisterioV3(-4));

		System.out.println(ej.demoSwitch(4));

		ej.repartirCaramelos(5, 3);
		ej.repartirCaramelos(1, 3);
		ej.repartirCaramelos(5, 5);
		
		System.out.println(ej.obtenerValorAbsoluto(54));
		System.out.println(ej.obtenerValorAbsoluto(-754));
		
		ej.mostrarNumeroEnLetra(45);
		ej.mostrarNumeroEnLetra(450);
		
		System.out.println(ej.esImparUltimaCifra(683));
		System.out.println(ej.esImparUltimaCifra(872));
		System.out.println(ej.esImparUltimaCifra(333333330));
		
		ej.hacerFct('p', true);
		ej.hacerFct('P', false);
		ej.hacerFct('s', true);
		ej.hacerFct('S', false);
		
		ej.mostrarNumero(43);
		ej.mostrarNumero(-68);
		ej.mostrarNumero(-57);
		
		ej.demoSwitch2("Lunes");
		ej.demoSwitch2("Domingo");
		
		System.out.println(ej.esVocalV1('a'));
		System.out.println(ej.esVocalV1('I'));
		System.out.println(ej.esVocalV1('J'));
		
		System.out.println(ej.calcularDiasMes(2, 2004));
		System.out.println(ej.calcularDiasMes(2, 2006));
		System.out.println(ej.calcularDiasMes(8, 2000));
		System.out.println(ej.calcularDiasMes(9, 2001));
		
		ej.detectarTipoLetra('a');
		ej.detectarTipoLetra('*');
		ej.detectarTipoLetra('O');
		ej.detectarTipoLetra('p');
		ej.detectarTipoLetra('W');
		ej.detectarTipoLetra('@');
	}

	/**
	 * 
	 * if con else completo (if anidado)
	 * 
	 * 
	 */
	public void printDescripcion(int edad, String nombre) {

		if (edad < 13) {
			System.out.println(nombre + " es un niño");
		} else {
			if (edad < 18) {
				System.out.println(nombre + " es un adolescente ");
			} else {
				System.out.println(nombre + "es un adulto");
			}
		}

	}

	/**
	 * if anidado, if ... else if
	 */
	public void printDescripcionOtraVersion(int edad, String nombre) {

		if (edad < 13)
			System.out.println(nombre + " es un niño");
		else if (edad < 18)
			System.out.println(nombre + " es un adolescente ");
		else
			System.out.println(nombre + " es un adulto");
	}

	/**
	 * 
	 */
	public boolean esPositivoPar(int numero) {
		if ((numero > 0) && (numero % 2 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 */
	public boolean metodoMisterioV1(int valor) {
		if (valor >= 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Uso de una variable local para devolver el valor después con return
	 */
	public boolean metodoMisterioV2(int valor) {
		boolean resultado = false;

		if (valor >= 0) {
			resultado = true;
		}

		return resultado;
	}

	/**
	 * El método anterior con expresión booleana
	 */
	public boolean metodoMisterioV3(int valor) {

		return (valor >= 0);
	}

	/**
	 * Demo de la sentencia switch
	 */
	public String demoSwitch(int dia) {
		String nombreDia;
		switch (dia) {
		case 1:
			nombreDia = "Lunes";
			break;
		case 2:
			nombreDia = "Martes";
			break;
		case 3:
			nombreDia = "Miércoles";
			break;
		case 4:
			nombreDia = "Jueves";
			break;
		case 5:
			nombreDia = "Viernes";
			break;
		case 6:
			nombreDia = "Sábado";
			break;
		case 7:
			nombreDia = "Domingo";
			break;
		default:
			nombreDia = "Incorrecto";
			break;
		}
		return nombreDia;
	}

	/**
	 * Mostrar uno de estos tres mensaje: " xxxx personas sin caramelos" " cada
	 * persona con un caramelo" " xxxx personas con más de un caramelo"
	 */
	public void repartirCaramelos(int personas, int caramelos) {

		if(caramelos < personas) {
			int contador = personas;
			contador -= caramelos;
			System.out.println("Hay " + contador + " sin caramelos");
		}else if(caramelos == personas ) {
			System.out.println("Cada persona tiene un caramelo");
		}else if(caramelos > personas) {
			int contador = caramelos;
			contador -= personas;
			System.out.println("Hay " + contador + " con mas de un caramelo");
		}
		
	}

	/**
	 * Calcula y devuelve el valor absoluto de numero
	 *
	 */
	public int obtenerValorAbsoluto(int numero) {
		int contador = 0;
		if(numero < 0) {
			while(numero != 0) {
				numero++;
				contador++;
			}
		}else {
			contador = numero;
		}		
		return contador;
	}

	/**
	 * Muestra como letra el valor de numero Para practicar if ... elseif ....
	 * Comprobar que el número está dentro del rango de los códigos que contienen
	 * letras.
	 */
	public void mostrarNumeroEnLetra(int numero) {

		if((numero >= 65 && numero <= 90)|(numero >= 97 && numero <= 122)) {
			char letraNumero = (char)numero;
			System.out.println(letraNumero);
		}else {
			System.out.println("No es un codigo valido");
		}
		
	}

	/**
	 * Devuelve true si es impar la última cifra de numero
	 *
	 */
	public boolean esImparUltimaCifra(int numero) {
		boolean esVerdad = ((numero % 10) % 2 != 0);
		return esVerdad;
	}

	/**
	 * Escribir "El alumno hará la FCT" si es del curso segundo 'S' / 's' y ha
	 * aprobado todo En cualquier caso mostrar el mensjae "Final de este método"
	 */
	public void hacerFct(char curso, boolean haAprobado) {
		if(curso == 's' || curso == 'S') {
			if(haAprobado) {
				System.out.println("El alumno hara la FCT");
			}
		}else {
			System.out.println("Final de este metodo");
		}
	}

	/**
	 * Si numero es positivo se decrementa su valor, se multiplica por 2 y se
	 * escribe Si es negativo se incrementa, se divide entre 2 y se escribe también
	 *
	 */
	public void mostrarNumero(int numero) {
		
		int contador = numero;
		if(numero >= 0) {
			contador--;
			contador *= 2;
			System.out.println(contador);
		}else {
			contador++;
			contador /= 2;
			System.out.println(contador);
		}
	}

	/**
	 * Demo de la sentencia switch Escribe día laborable/ No laborable
	 */
	public void demoSwitch2(String dia) {
		
		switch(dia) {
		case "lunes" :
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			System.out.println("Es dia laborable");
			break;
		case "sabado":
		case "domingo":
			System.out.println("No es dia laborable");
			break;
		default:
			System.out.println("error");
			break;
		}
		
	}

	/**
	 * Demo de la sentencia switch devuelve true si es vocal / false en otro caso
	 */
	public boolean esVocalV1(char letra) {
		switch(letra){
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			return true;
		default:
			return false;
		}
	}

	/**
	 * Calcula y devuelve los días del mes indicado Para el mes febrero habrá que
	 * tener en cueta si año es o no bisiesto (múltiplo de 4) Si el mes es
	 * incorrecto devolver -1
	 * 
	 *
	 */
	public int calcularDiasMes(int mes, int anio) {
		if(anio % 4 == 0) {
			switch(mes) {
			case 2: 
				return 29;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			default:
				return -1;
			}
		}else {
			switch(mes) {
			case 2: 
				return 28;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			default:
				return -1;
			}
		}
	}

	/**
	 * si no es una letra mensaje error si letra vocal mayúscula escribir vocal
	 * mayúscula si letra vocal minúscula escribir minúscula escribir consonante en
	 * otro caso
	 */
	public void detectarTipoLetra(char letra) {
		if(((int)letra >= 65 && (int)letra <= 90)|((int)letra >= 97 && (int)letra <= 122)) {
			switch(letra) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Es mayuscula");
				break;
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("Es minuscula");
				break;
			default:
				System.out.println("Es consonante");
			}
			
		}else {
			System.out.println("error");
		}
	}

}
