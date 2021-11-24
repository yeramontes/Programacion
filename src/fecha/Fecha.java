package fecha;

public class Fecha {
	private int dia;
	private int mes;
	private int año;
	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}	

	public boolean esBisiesto() {
		
		return (año % 4 == 0 && año % 100 != 0) || (año % 100 == 0 && año % 400 == 0);
		
	}
	
	public int diasMes() {
		switch(mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;
			case 2:
				if(esBisiesto()) {return 29;}else {return 28;}
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			default:
				return 0;
		}
	}
	
	public void printCorta() {
		String resultado = dia + "-" + mes + "-" + año;
		System.out.println(resultado);
	}
	
	public void printLarga(){
		System.out.print(dia + " de ");
		switch (mes) {
			case 1:
			System.out.print("enero");
			break;
			case 2:
			System.out.print("febrero");
			break;
			case 3:
			System.out.print("marzo");
			break;
			case 4:
			System.out.print("abril");
			break;
			case 5:
			System.out.print("mayo");
			break;
			case 6:
			System.out.print("junio");
			break;
			case 7:
			System.out.print("julio");
			break;
			case 8:
			System.out.print("agosto");
			break;
			case 9:
			System.out.print("septiembre");
			break;
			case 10:
			System.out.print("octubre");
			break;
			case 11:
			System.out.print("noviembre");
			break;
			case 12:
			System.out.print("diciembre");
			break;
			default:
				System.out.print("Incorrecto");
		}
		System.out.print(" de " + año);
	}
	
	public boolean esCorrecta() {
		boolean mesCorrecto = (mes >= 1 && mes <= 12);
		boolean diaCorrecto = (dia >= 1 && dia <= diasMes());
		if( mesCorrecto & diaCorrecto) {return true;}else {return false;}
	}
}