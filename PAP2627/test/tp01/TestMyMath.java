package tp01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestMyMath {

	@Test
	void testFact() {
		assertEquals(1,MyMath.fact(0));
		assertEquals(1,MyMath.fact(1));
		assertEquals(120,MyMath.fact(5));
		assertThrows(AssertionError.class,()-> MyMath.fact(-1));
		assertThrows(AssertionError.class,()-> MyMath.fact(21));
	}

}
