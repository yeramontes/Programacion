package circuloPunto;
/**
 * La clase representa a circulos con un centro
 * y un valor determinado de radio
 * 
 * @author 
 * @version 
 */
public class Circulo
{
    private final double PI = 3.14;
    private double radio;
    private Punto centro;

     /**
     * constructor para los objetos de la clase Circulo
     * 
     */
    
    public Circulo(double radio) {
    	this.radio = radio;
    	this.centro = new Punto(0, 0);
    }
    
    public Circulo(double radio, Punto centro)
    {
       this.radio = radio;
       this.centro = centro;
    }
    
    public Punto getCentro() {
    	return centro;
    }
    
    public void setCentroX(int x) {
    	centro.setX(x);
    }
    
    public void setCentroY(int y) {
    	centro.setY(y);
    }
    
   
    /**
     * 
     * @return devuelve el radio del círculo    
     */
    public double getRadio()
    {
        return radio;
    }
    
        
      /**
     * 
     * @param   El nuevo valor del radio
     */
    public void setRadio(int nuevoRadio)
    {
        radio = nuevoRadio;
    }
    
    /**
     * @return devuelve el área del círculo
     */
    public double calcularArea()
    {
        return PI * radio * radio;
    }
    
    /**
     * @return devuelve el perímetro del círculo
     */
    public double calcularPerímetro()
    {
        return 2 * PI * radio;
    }
    
    
    public String toString() {
    	StringBuilder resultado = new StringBuilder();
    	resultado.append("\nEl radio del circulo es de: " + radio);
    	resultado.append("\nCentro: \n\t" + centro.toString());
    	return resultado.toString();
    }
    
    public void printCirculo() {
    	System.out.println(toString());
    }
 
    
}
