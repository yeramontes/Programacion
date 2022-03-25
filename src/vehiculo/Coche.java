package vehiculo;

import java.awt.Color;

public class Coche extends VehiculoAMotor{
	private int numeroPuertas;
	private static final int NUMERO_RUEDAS = 4;
	private boolean esDescapotable;
	
	public Coche(int velocidad, Color color, int cilindrada, String matricula, int numeroPuertas,
			boolean esDescapotable) {
		super(velocidad, color, cilindrada, matricula);
		this.numeroPuertas = numeroPuertas;
		this.esDescapotable = esDescapotable;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	
	private int getNumeroRuedas() {
		return NUMERO_RUEDAS;
	}

	public boolean getEsDescapotable() {
		return esDescapotable;
	}

	public void setEsDescapotable(boolean esDescapotable) {
		this.esDescapotable = esDescapotable;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coche [");
		builder.append(super.toString());
		builder.append("\nnumeroPuertas=");
		builder.append(numeroPuertas);
		builder.append("\nesDescapotable=");
		builder.append(esDescapotable ? "Si" : "No");
		builder.append("\n]");
		return builder.toString();
	}
	
	
	
}
