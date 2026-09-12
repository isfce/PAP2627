package tp00;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEvaluation {

	@Test
	void testCalculDecision() {
		assertEquals("Refus", Evaluation.calculDecision(0));
		assertThrows(AssertionError.class, () -> Evaluation.calculDecision(-2));
		assertThrows(AssertionError.class, () -> Evaluation.calculDecision(101));
	}

}
