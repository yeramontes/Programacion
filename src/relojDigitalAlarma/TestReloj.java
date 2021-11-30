package relojDigitalAlarma;

public class TestReloj {
	private RelojAlarma miReloj;
	private RelojAlarma tuReloj;
	
	public TestReloj() {
		miReloj = new RelojAlarma(18, 32);
		tuReloj = new RelojAlarma(23, 58);
	}
	
	public void test1() {
		miReloj.setAlarma(18, 35);
		System.out.println(miReloj.getHora());
		System.out.println(miReloj.getAlarma());
		
		for(int minutosAvanzados = 1; minutosAvanzados <= 3; minutosAvanzados++) {
			miReloj.emitirTic();
		}
	}
	
	public void test2() {
		tuReloj.setAlarma(7, 0);;
		System.out.println(tuReloj.getHora());
		System.out.println(tuReloj.getAlarma());
		
		for(int minutosAvanzados = 1; minutosAvanzados <= 5; minutosAvanzados++) {
			tuReloj.emitirTic();
		}
		System.out.println(tuReloj.getHora());
	}
	
	public void test3(int hora, int minutos) {
		miReloj.setAlarma(18, 35);
		System.out.println(miReloj.getHora());
		System.out.println(miReloj.getAlarma());
		
		
		miReloj.ponerEnHora(hora, minutos);
		System.out.println(miReloj.getHora());
	}
}
