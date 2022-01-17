 package frecuenciaDado;
/**
 *  clase FrecuenciaDado 
 *  
 */
public class FrecuenciaDado
{
    private Dado dado;
    private int[] frecuencia;

    /**
     * Constructor de la clase FrecuenciaDado
     */
    public FrecuenciaDado()
    {
        dado = new Dado();
        frecuencia = new int[dado.NUMERO_CARAS];
    }

    /** 
     * tirar el dado n veces y contabilizar la frecuencia de aparición
     * de la tirada
     */
    public void  tirarDado(int veces)
    {
    	for(int i = 0; i < veces; i++) {
    		dado.tirarDado();
    		frecuencia[(dado.getCara() - 1)] += 1;
    	}

    }

    /**
     *  Mostrar las frecuencias
     */
    public void escribirFrecuencia()
    {
        System.out.println("Cara\tFrecuencia");
        for(int i = 0; i < frecuencia.length; i++) {
        	System.out.println((i + 1) + "\t" + frecuencia[i]);
        }

    }

}
