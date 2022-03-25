package casinos;

import java.util.Comparator;

public class ComparadorPrecioCopa implements Comparator<Casino>{

	@Override
	public int compare(Casino o1, Casino o2) {
		// TODO Auto-generated method stub
		if(o1 == null || o2 == null) return 0;
		return (int) (Math.signum(o1.getPrecioCopa() - o2.getPrecioCopa()));
	}
	
}
