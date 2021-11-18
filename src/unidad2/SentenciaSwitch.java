package unidad2;
import java.util.Scanner;
import java.util.Locale;
import java.text.DateFormatSymbols;

public class SentenciaSwitch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Locale region = new Locale("es", "MX");
		DateFormatSymbols name = new DateFormatSymbols(region);
		System.out.println("Introduce el mes: ");
		int mes = in.nextInt();
		String nombreMes = (name.getMonths()[mes - 1]).toUpperCase();
		// int año = in.nextInt();
		switch (mes) {
		case 2:
			System.out.println(nombreMes + " tiene 28 dias.");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(nombreMes + " tiene 31 días.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(nombreMes + " tienes 30 días.");
		}
	}
}
