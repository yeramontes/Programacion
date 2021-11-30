package relojDigitalAlarma;

public class RelojAlarma {
	
	private VisorReloj reloj;
	private Alarma alarma;
	
		public RelojAlarma() {
			reloj = new VisorReloj();
			alarma = new Alarma();
		}
		
		public RelojAlarma(int hora, int minutos) {
			reloj = new VisorReloj(hora , minutos);
			alarma = new Alarma();
		}
		
		public void emitirTic() {
			reloj.emitirTic();
			if(esHoraAlarma()) {
				System.out.println("RRRIIIIINNNNNGGGGG");
			}
		}
		
		public String getHora() {
			return reloj.getHora();
		}
		
		public void setAlarma(int hora, int minutos) {
			alarma.setHoraAlarma(hora, minutos);
		}
		
		private boolean esHoraAlarma() {
			return reloj.getHora().equals(alarma.getHoraAlarma());
		}
		
		public String getAlarma() {
			return alarma.getHoraAlarma();
		}
}
