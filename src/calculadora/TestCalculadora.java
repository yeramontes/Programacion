package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCalculadora {

	@Test
	void testIOException() {
		Calculadora cal = new Calculadora();
		IOException io = assertThrows(IOException.class, () -> {
			 cal.leerOperandos("2 3 4");
		});
		Assertions.assertEquals("No has introducido parametros correctos", io.getMessage());
	}

	@Test
	void notIOException() throws IOException{
		Calculadora cal = new Calculadora();
		cal.leerOperandos("2 3");
		assertEquals(2, cal.getAtrib1());
		assertEquals(3, cal.getAtrib2());
	}
	
	
}
