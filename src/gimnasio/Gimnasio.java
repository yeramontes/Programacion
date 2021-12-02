
/**
 * ENTREGA UT3
 * 
 * @author - (aquí pon tu nombre)
 * 
 * 
 *         Un gimnasio oferta clases de yoga, pilates y spinning en sus
 *         diferentes salas. En cada sala se realiza una actividad de la misma
 *         duración que se repite a lo largo del día un nº de veces. Puede
 *         haber salas con la misma actividad pero de duración diferentes (ej.
 *         en la sala 1 se hace spinning en clases de 40 minutos y en la sala 3
 *         se hace también spinning pero de duración 70 minutos).
 * 
 *         El precio de las clases depende de su duración. El precio base es
 *         3.0€ y se añade a este precio 0.20€ por cada período completo
 *         de 15 minutos.
 * 
 * 
 *         La primera clase comienza siempre a las 10.30 (a.m) y la última no
 *         puede acabar después de las 8.30 (p.m). En todas las salas entre
 *         clase y clase (incluida la última) hay un descanso de 10 minutos
 * 
 *         El gimnasio quiere mostrar al usuario el nº de clases que se dan en
 *         cada sala con su precio y además quiere efectuar ciertos cálculos
 *         dependiendo del nº de personas que se han inscrito a las actividades
 *         de las diferentes salas
 */
public class Gimnasio {
	private final int HORA_PRIMER_CLASE = 10;
	private final int MINUTOS_PRIMERA_CLASE = 30;
	private final int HORA_ULTIMA_CLASE = 8;
	private final int MINUTOS_ULTIMA_CLASE = 20;
	private final int DESCANSO = 10;
	private final double PRECIO_BASE = 3.0;
	private final double PRECIO_15MINUTOS = 0.20;
	private final char YOGA = 'Y';
	private final char PILATES = 'P';
	private final char SPINNING = 'S';
	private String nombre;
	private int yoga;
	private int pilates;
	private int spinning;
	private double totalAcumulado;
	private int salaMaximoSpinning;
	private int inscritosMaximoSpinning;

	/**
	 * Constructor - Recibe un único parámetro, el nombre del gimnasio e
	 * inicializa el resto de atributos adecuadamente
	 */
	public Gimnasio(String nombre) {
		this.nombre = nombre;
		this.yoga = 0;
		this.pilates = 0;
		this.spinning = 0;
		this.totalAcumulado = 0;
		this.salaMaximoSpinning = 0;
		this.inscritosMaximoSpinning = 0;
	}

	/**
	 * Accesor para el nombre del gimnasio
	 *
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Mutador para el nombre del gimnasio
	 *
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * accesor para el importe total acumulado entre todos los inscritos en el
	 * gimnasio
	 *
	 */
	public double getImporteTotal() {
		return totalAcumulado;
	}

	/**
	 * Este método recibe 4 parámetros: - sala: el nº de sala donde se hace la
	 * actividad - tipo: el tipo de actividad, un carácter 'Y' yoga, 'P' pilates
	 * 'S' spinning - horas y minutos : duración de la actividad en nº horas y
	 * minutos - inscritos: el nº de personas inscritas en esa actividad en la sala
	 * 
	 * Por ej, tarificarClaseEnSala(4, 'P', 1, 5, 15) significa que en la sala 4 se
	 * hace pilates, las clases duran 1 hora y 5 minutos y se han inscrito en esta
	 * sala 15
	 * 
	 * A partir de esta información el método debe calcular: - total inscritos por
	 * tipo de actividad (independientemente de la sala) - la sala y el máximo nº
	 * de inscritos en spinning en esa sala
	 * 
	 * Utiliza una sentencia switch para analizar el tipo de actividad
	 * 
	 * También el método calculará y mostrará posteriormente la siguiente
	 * información: - el precio de la clase en la sala (basándose en su
	 * duración). En el ejemplo anterior la clase de pilates duraba 1 hora y 5
	 * minutos . Como el total de minutos de duración es 65 su precio será: 3 +
	 * 0,20 * 4 = 3,8 ya que son 4 los períodos completos de 15 minutos que hay -
	 * nº de veces que la clase se ofertará en la sala (dependerá de su
	 * duración. No olvidar que entre clase y clase siempre hay un descanso) - la
	 * hora de finalización de la última clase (hora y minutos) - !!Ver resultados
	 * de ejecución!! - el método además irá registrando el importe total que
	 * lleva acumulado el gimnasio entre todas las personas inscritas
	 * 
	 */
	public void tarificarClaseEnSala(int sala, char tipo, int horas, int minutos, int inscritos) {
		
		//////// Total incritos en cada tipo de actividad /////////////////////////////
		
		switch (tipo) {
		case 'Y':
			yoga++;
			break;
		case 'P':
			pilates++;
			break;
		case 'S':
			spinning++;
			break;
		}
		
		System.out.println("El total de inscritos en yoga es de : " + yoga);
		System.out.println("El total de inscritos en yoga es de : " + pilates);
		System.out.println("El total de inscritos en yoga es de : " + spinning);
		
		///////////////////////////////////////////////////////////////////////////////

		//////// Calcular el valor de la clase (3$ base + (horas y minutos)/15 <Solo se
		//////// cuenta si son 15 minutos completos>)

		int tiempoAContar = horas * 60 + minutos;
		if (tiempoAContar >= 15) {
			int ciclos;
			ciclos = tiempoAContar / 15;
			totalAcumulado += 3 + (tiempoAContar * PRECIO_15MINUTOS);
		}

		System.out.println("El total acumulado hasta el momento es : " + totalAcumulado);
		
		//////////////////////////////////////////////////////////////////////////////////

		///////// Numero de veces que se oferta la clase en un dia ///////////////////////
		
		int minsClasesTotales = ((HORA_ULTIMA_CLASE + 12) * 60 + MINUTOS_ULTIMA_CLASE)-(HORA_PRIMER_CLASE * 60 + MINUTOS_PRIMERA_CLASE);
		int numClases;
		while(minsClasesTotales >= (tiempoAContar + DESCANSO)) {
			numClases++;
			minsClasesTotales -= (tiempoAContar + DESCANSO);
		}
		
		System.out.println("El numero de clases por dia es de : " + numClases);
		
		/////////////////////////////////////////////////////////////////////////////////
		
		//////// La hora a la que acabara la ultima clase ///////////////////////////////
		
		int horaUltimaClase = HORA_PRIMER_CLASE + (horas * numClases);
		int minutosUltimaClase = MINUTOS_PRIMERA_CLASE + (minutos * numClases);
		String ampm = "am";
		
		if(minutosUltimaClase >= 60) {
			horaUltimaClase += minutosUltimaClase / 60;
			minutosUltimaClase -= ((minutosUltimaClase / 60) * 60);
		}
		
		if(horaUltimaClase > 12) {horaUltimaClase -= 12; ampm = "pm";}
		
		System.out.println("La ultima clase acabara a las " + horaUltimaClase + ":" + minutosUltimaClase + ampm);
		
		/////////////////////////////////////////////////////////////////////////////////
		
	}

	/**
     *  nº sala en la que hay más inscritos para spinning
     */
    public int getSala()
    {
     if(yoga > spinning) return yoga;
     else if(spinning > yoga) return spinning;
     else if(yoga > )
    }

	/**
     * Devuelve el nombre de la actividad con más inscritos independientemente de la sala
     *  
     */
    public      getActividad()
    {
        

    }

}
