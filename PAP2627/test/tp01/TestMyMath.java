package tp01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestMyMath {

	@Test
	void testFact() {
		assertEquals(1, MyMath.fact(0));
		assertEquals(1, MyMath.fact(1));
		assertEquals(120, MyMath.fact(5));
		assertThrows(AssertionError.class, () -> MyMath.fact(-1));
		assertThrows(AssertionError.class, () -> MyMath.fact(21));
	}

	@Test
	void testCalculSomme() {
		assertEquals(0, MyMath.calculSomme(-5, 5));
		assertEquals(-5 - 4, MyMath.calculSomme(-5, 3));
		assertEquals(4 + 5, MyMath.calculSomme(-3, 5));
		assertEquals(1 + 2 + 3, MyMath.calculSomme(1, 3));
		assertEquals(-(1 + 2 + 3), MyMath.calculSomme(-3, -1));
		assertThrows(AssertionError.class, () -> MyMath.calculSomme(10, 4));
	}

	@Test
	void testFibo() {
		assertEquals(0, MyMath.fibo(0));
		assertEquals(1, MyMath.fibo(1));
		assertEquals(8, MyMath.fibo(6));
		assertThrows(AssertionError.class, () -> MyMath.fibo(-1));
	}

	@Test
	void testNbOr() {
		assertEquals(1, MyMath.nombreOr(0.7));
		assertEquals(9, MyMath.nombreOr(0.001));
		assertThrows(AssertionError.class, () -> MyMath.nombreOr(0));
	}
	
		@Test
		void testPremier() {
			assertTrue(MyMath.estPremier(2));
			assertTrue(MyMath.estPremier(3));
			assertTrue(MyMath.estPremier(5));
			assertTrue(MyMath.estPremier(7));
			assertTrue(MyMath.estPremier(11));
	
			assertFalse(MyMath.estPremier(4));
			assertFalse(MyMath.estPremier(9));
			assertFalse(MyMath.estPremier(10));
			assertThrows(AssertionError.class, () -> MyMath.estPremier(1));
		}
	
}
