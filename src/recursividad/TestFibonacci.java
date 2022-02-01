package recursividad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFibonacci {

	@Test
	void test() {
		assertEquals(1 , Fibonacci.fibonacci(2));
	}
	
	@Test
	void test2() {
		assertEquals(21 , Fibonacci.fibonacci(8));
	}

	@Test
	void test3() {
		assertEquals(3524578  , Fibonacci.fibonacci(33));
	}
}
