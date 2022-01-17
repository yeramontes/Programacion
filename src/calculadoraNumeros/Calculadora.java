package calculadoraNumeros;
import java.util.Arrays;
/**
 * clase Calculadora
 * 
 */
public class Calculadora
{
    public static final int MAX = 15;
    private int[] numeros;
    private int total;

    /**
     * Constructor de la clase Calculadora
     */
    public Calculadora()
    {
       numeros = new int[MAX];
       total = 0;
    }

    /**
     * Constructor de la clase Calculadora
     */
    public Calculadora(int[] numeros)
    {
    	int maximo = (numeros.length > MAX) ? MAX : numeros.length;
    	this.numeros = Arrays.copyOf(numeros, maximo);
    	total = numeros.length;
    }

    public int[] getNumeros() {
    	return numeros;
    }

    /**
     * Añadir un nº al final (si es posible, es decir, 
     * la calculadora no está completa)
     *     
     */
    public void introducirNumero(int numero)
    {
    	if(total <= numeros.length) {
            numeros[total] = numero;
            total++;
            
    	}else System.out.println("Limite de capacidad alcanzado.");

    }

    /**
     *  devuelve true si la calculadora está completa
     *
     */
    public boolean estaLlena()
    {
        return total == numeros.length;
    }

    /**
     * Acessor para la cantidad de números en la calculadora
     */
    public int getTotal()
    {
         return total;
    }

    /**
     * Contar los núemros mayores que uno dado
     */
    public int contarMayoresQue(int numero)
    {
       int mayoresQue = 0;
       for(int i = 0; i < total; i++) {
    	   if(numero > numeros[i]) mayoresQue++;
    	   
       }
       return mayoresQue;
    }

    /**
     * Intercambiar el valor de dos elementos del array
     * @param i posición de un nº a intercambiar
     *        j posición del segundo nº a intercambiar
     */
    public void intercambiar(int i, int j)
    {
        if(posicionCorrecta(i) && posicionCorrecta(j)) {
        	int primero = numeros[j];
        	numeros[j] = numeros[i];
        	numeros[i] = primero;
        	
        }
    }

    /**
     * @param pos la posición a comprobar
     * @return true si es correcta
     */
    private boolean posicionCorrecta(int pos)
    {
        return (pos >= 0 && pos < numeros.length);
    }

    /**
     * 
     * @return true si la calculadora tiene algún número
     */
    private boolean hayNumeros()
    {
        for(int i = 0; i < numeros.length; i++) {
        	if(numeros[i] != 0) {
        		return true;
        		
        	}
        	
        }
        
        return false;
    }

       /**
     *  devuelve un array con los números de la calculadora 
     *  con todos sus dígitos en orden decreciente
     *  Usa el método privado   enOrdenDecreciente() 
     *  Si numeros = {45, 6, 965, 123, 93, 489, 321}  devuelve {6, 965, 93, 321 }
     */
    public int[] todoDigitosDecreciente() 
    {
    	int[] numeros = new int[1];
    	int posicion = 0;
    	for(int i = 0; i < this.numeros.length; i++) {
    		if(ordenDecreciente(this.numeros[i]) > 0) {
    			numeros = Arrays.copyOf(numeros, numeros.length + 1);
    			numeros[posicion] = this.numeros[i];
    			posicion++;
    			
    		}
    		
    	}
    	
    	return numeros;
                 
    }
    
    /**
     *  Dado un nº n indica si todos sus dígitos están en roden decreciente
     *  Haz una versión recursiva para este método
     */
    
    /////////////////////////// PODRIA SER STATIC /////////////////////
    public int ordenDecreciente(int n){
        int x = n % 10;
        int y = n / 10;
        if( y == 0) return n;
        if(x <= ordenDecreciente(y)) return n; else return 0;
        
     }
    
    /**
     * 
     * Borra el último elemento del atributo numeros
     */
    public void borrarUltimoElemento()
    {
         numeros[total - 1] = 0;
         total--;
    }  
    
    /**
     *  Vacía la calculadora
     *
     */
    public void vaciar()
    {
    	if(hayNumeros()) {
    		for(int i = 0; i < numeros.length; i++) {
            	numeros[i] = 0;
            	
            }
            total = 0;
            
    	}
    }


    /**
     * 
     * Muestra los números guardados en la calculadora
     */
    public void escribirNumeros()
    { 
        for(int i = 0; i < total; i++) {
        	System.out.print(numeros[i] + " ");
        }
        
        
    }

    /**
     * @param n el nº a comprobar
     * @return true si n es par
     */
    ///////////////////////////////////////// PODRIA SER STATIC /////////////////////////////
    
    private boolean esPar(int n)
    {
        if(n % 2 == 0) return true; else return false;
    }

    /**
     * Borra los números de valor par
     */
    public void borrarPares()
    {
        for(int i = 0;i < numeros.length; i++) {
        	if(esPar(numeros[i])) borrarUnPar(i);

        }
    }

    /**
     * Borra el valor de una determinada posición
     * @param pos la posición del valor a borrar
     * 
     */
    private void borrarUnPar(int pos)
    {
        numeros[pos] = 0;
    }

    /**
     * Insaerta un nº en la posición indicada
     * @param numero el nº a insertar
     * @param pos la posción en la que se insertará
     */
    public  void insertarEnPosicion(int numero, int pos)
    {
       if(pos < 0 || (pos >= numeros.length)) {
    	   throw new IllegalArgumentException("Posición incorrecta");
    	   
       }else numeros[pos] = numero;

    }

}
