package co.edu.usbcali.unittesttdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UnitTestSumar {
	
	@Test
	void ejecutarSumaTest() {
		int a = 5, b = 8;
		int c = Sumar.ejecutarSuma(a, b);
		assertEquals(13, c);
	}

	
}
