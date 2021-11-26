package baraja;

public class CartaBaraja {
	private final int OROS = 1;
	private final int COPAS = 2;
	private final int  ESPADAS = 3;
	private final int BASTOS = 4;
	private int palo;
	private int valor;
	
	public CartaBaraja(int queValor, int quePalo){
		this.palo = quePalo;
		this.valor = queValor;
	}
	
	public String getPalo() {
		switch(this.palo) {
		case OROS:
			return "OROS";
		case COPAS: 
			return "COPAS";
		case ESPADAS:
			return "ESPADAS";
		case BASTOS:
			return "BASTOS";
		default:
			return "Palo incorrecto";
		}
	}
	
	public String getValor() {
		String[] Valores = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Sota", "Caballo", "Rey"};
		for(int i = 0; i < 12; i++) {
			if((this.valor - 1) == i) {
				return Valores[i];
			}
		}
		return "Valor incorrecto";
	}
	
	public String toString(){
		return getValor() + " de " + getPalo();
	}
}
