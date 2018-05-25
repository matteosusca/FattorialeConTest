import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FattorialeTest {

	@Test
	void test() {
		int n = 4;
		assertEquals(24, FattorialeFunz.Fattoriale(n));
	}

}