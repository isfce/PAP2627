package tp00;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestTpToussaint {

	@Test
	void testCompareDate() {
		assertEquals(0, TpToussaint.compareDate(1, 2, 2026, 1, 2, 2026));

		//	assertThrows(AssertionError.class, () -> TpToussaint.compareDate(32,2,2026,1,2,2026));
	}

}
