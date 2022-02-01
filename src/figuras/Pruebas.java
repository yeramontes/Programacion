package figuras;
import java.awt.Color;
public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura f = new Triangulo(0,0,5,7);
		Figura i = new Triangulo(0,0,5,7);
		Figura l = new Triangulo(0,0,5,9);
		GestorFiguras g = new GestorFiguras();
		g.addFigura(f);
		g.addFigura(l);

		Color blanco = Color.white;
		//g.borrarColor(blanco);

		g.borrarIgualesA(i);
		g.listarFiguras();
	}

}
