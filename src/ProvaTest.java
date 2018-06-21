import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProvaTest {

	@Test
	void test() {
		assertEquals("La data immessa è il 3 Marzo del 2001", ProvaFunz.Giorno(3,3,2001));
	}

}