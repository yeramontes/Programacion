package casinos;

import java.util.Comparator;

public class ComparadorPorNombre implements Comparator<Casino>{

	@Override
	public int compare(Casino o1, Casino o2) {
		// TODO Auto-generated method stu
		if(o1 == null || o2 == null) return 0;
		return o1.getNombre().compareTo(o2.getNombre());
	}
	
}
