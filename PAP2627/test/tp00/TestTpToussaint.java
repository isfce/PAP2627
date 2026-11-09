package tp00;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TestTpToussaint {

	@Test
	void testCompareDate() {
		assertEquals(0, TpToussaint.compareDate(1, 2, 2026, 1, 2, 2026));
		assertEquals(1, TpToussaint.compareDate(2, 2, 2026, 1, 2, 2026));
		assertEquals(1, TpToussaint.compareDate(1, 3, 2026, 1, 2, 2026));
		assertEquals(1, TpToussaint.compareDate(1, 2, 2028, 1, 2, 2026));
		assertEquals(-1, TpToussaint.compareDate(1, 2, 2026, 2, 2, 2026));
		assertEquals(-1, TpToussaint.compareDate(1, 2, 2026, 1, 3, 2026));
		assertEquals(-1, TpToussaint.compareDate(1, 2, 2026, 1, 2, 2028));
		assertThrows(AssertionError.class, () -> TpToussaint.compareDate(32, 2, 2026, 1, 2, 2026));
		assertThrows(AssertionError.class, () -> TpToussaint.compareDate(1, 22, 2026, 1, 2, 2026));
		assertThrows(AssertionError.class, () -> TpToussaint.compareDate(3, 2, 2026, 44, 2, 2026));
		assertThrows(AssertionError.class, () -> TpToussaint.compareDate(3, 2, 2026, 1, 22, 2026));
	}

}
