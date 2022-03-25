package casinos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestCasinos {
	LasVegas vegas = new LasVegas();
	
	@Test
	void ordenarPorNombre() {
		Arrays.sort(vegas.getCasinos(), new ComparadorPorNombre());
		assertEquals("Bellagio", vegas.getCasinos()[0].getNombre());
	}

	@Test
	void ordenarPorCopa() {
		Arrays.sort(vegas.getCasinos(), new ComparadorPrecioCopa());
		for(int i = 0; i < vegas.getCasinos().length; i++) {
			assertEquals(vegas.getCasinos()[i].getPrecioCopa() < vegas.getCasinos()[i + 1].getPrecioCopa(), true);
		}

	}
}
