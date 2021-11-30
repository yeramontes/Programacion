package relojDigitalAlarma;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RelojAlarma x = new RelojAlarma(6 , 59);
		System.out.println(x.getHora());
		System.out.println(x.getAlarma());
		x.emitirTic();
	}

}
