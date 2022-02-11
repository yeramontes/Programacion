package pkgaeropuerto.modelo;

import java.util.Comparator;

public class ComparatorPlazasLibres implements Comparator<Vuelo> {

	@Override
	public int compare(Vuelo o1, Vuelo o2) {
		// TODO Auto-generated method stub
		if( ((Regular) o1).getPlazasLibres() > ((Regular) o2).getPlazasLibres()) return 1;
		if(((Regular) o1).getPlazasLibres() < ((Regular) o2).getPlazasLibres()) return -1;
		else return 0;
	}

}
