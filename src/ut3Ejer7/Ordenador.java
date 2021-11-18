package ut3Ejer7;

public class Ordenador {
	private int maxMemoria; 
	private int memoriaInstalada;
	
	
	public Ordenador(int maxMemoria) {
		if(maxMemoria > 0) {
			this.maxMemoria = maxMemoria;
		}else {
			this.maxMemoria = 1024;
		}
		
		memoriaInstalada = 0;
	}


	public int getMaxMemoria() {
		return maxMemoria;
	}

	public int obtenerMemoriaDisponible() {
		int memoriaDisponible = maxMemoria - memoriaInstalada;
		return memoriaDisponible;
	}
	
	public void vaciarMemoria() {
		memoriaInstalada = 0;
	}
	
	public boolean instalar256Mb() {
		
		if(maxMemoria - memoriaInstalada >= 256) {
			memoriaInstalada += 256;
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean instalarMemoria(int memoria) {
		
		if((memoria <= obtenerMemoriaDisponible()) & (memoria > 0)) {
			memoriaInstalada += memoria;
			return true;
		}else {
			return false;
		}
		
	}
	
	public void printInformacion() {
		StringBuilder print = new StringBuilder();
		print.append("Este ordenador puede tener hasta ");
		print.append(getMaxMemoria());
		print.append(" Mb de memoria. Todavía es posible instalar ");
		print.append(obtenerMemoriaDisponible());
		print.append(" Mb");
		System.out.println(print.toString());
	}
	
}
