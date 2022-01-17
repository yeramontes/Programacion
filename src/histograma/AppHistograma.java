package histograma;

public class AppHistograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Histograma hg = new Histograma();
		System.out.println(hg.generarAleatorio());
		int[] x = hg.getValores();
		for(int i = 0; i < x.length; i++) System.out.println(x[i]);
		x = hg.getValores2();
		for(int i = 0; i < x.length; i++) System.out.println(x[i]);
	}

}
