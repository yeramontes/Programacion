package circuloPunto;
/**
 * Representa a un punto en el espacio bidimensional
 * 
 * @author 
 * @version 
 */
public class Punto 
{
	private int x;
	private int y;

	/**
	 * Constructor de la clase Punto
	 */
	public Punto(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}

	/**
	 * Accesor para el atributo x
	 * @return  El valor de la coordenada x   
	 */
	public int getX() 
	{
		return x;
	}

	/**
	 * Accesor para el atributo y
	 * @return  El valor de la coordenada y   
	 */
	public int getY()
	{
		return y;
	}

	/**
	 * 
	 *  Mutador para la coordenada x
	 * @param x es el nuevo valor de x
	 */
	public void setX(int x)
	{
		this.x = x;
	}

	/**
	 * Mutador para la coordenada y
	 * @param  y es el nuevo de y  
	 */
	public void setY(int y) 
	{
		this.y = y;
	}
	
	public double getDistanciaDesdeOrigen() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
	public double getDistaniaDesde(Punto p) {
		return Math.sqrt(Math.pow((this.x - p.getX()), 2) + Math.pow((this.y - p.getY()), 2));
	}
	
	
	/**
	 * @return  Devuelve una cadena con la representaci�n del 
	 *          punto
	 */
	public String toString() 
	{
		String str = "";
		str = str + "Valor de x = " + x + "\n" + "Valor de y = " + y + "\n";
		return str;
	}

}
