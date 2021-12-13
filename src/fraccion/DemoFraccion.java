package fraccion;

public class DemoFraccion {
		
		private Fraccion fraccion1;
		private Fraccion fraccion2;
		
		public void demo1() {
			fraccion1 = new Fraccion();
			fraccion1.setNumerador(-4);
			fraccion1.setDenominador(7);
			fraccion2 = new Fraccion(13,2);
			escribirFraccion("La suma es : ", fraccion1.sumar(fraccion2));
			escribirFraccion("La resta es : ", fraccion1.restar(fraccion2));
			escribirFraccion("El producto es : ", fraccion1.multiplicar(fraccion2));
			escribirFraccion("La division es : ", fraccion1.dividir(fraccion2));
			
		}
		
		public void demo2() {
			fraccion1.setNumerador(17);
			fraccion1.setDenominador(25);
			fraccion2.setNumerador(16);
			fraccion2.setDenominador(11);
			if(fraccion1.menorQue(fraccion2)) {
				System.out.println("Es mayor");
			}else if(fraccion1.igualQue(fraccion2)) {
				System.out.println("Son iguales");
			}else {
				System.out.println("Es menor");
			}
			
			escribirFraccion("Esta es la copia : ", fraccion1.clonar());
		}
		
		private void escribirFraccion(String mensaje, Fraccion fraccion) {
			System.out.println(mensaje + fraccion.toString());
		}

}
