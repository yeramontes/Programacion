package vehiculo;
import java.awt.Color;

public class VehiculoAMotor extends Vehiculo{
	private int cilindrada;
	private String matricula;
	
	public VehiculoAMotor(int velocidad, Color color, int cilindrada, String matricula) {
		super(velocidad, color);
		this.cilindrada = cilindrada;
		this.matricula = matricula;
	}
	
	public VehiculoAMotor(int cilindrada, String matricula) {
		super();
		this.cilindrada = cilindrada;
		this.matricula = matricula;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nVehiculoAMotor [");
		builder.append(super.toString());
		builder.append("\\ncilindrada=");
		builder.append(cilindrada);
		builder.append("\nMatricula=");
		builder.append(matricula);
		builder.append("\n]");
		return builder.toString();
	}
	
	
	
	
}
