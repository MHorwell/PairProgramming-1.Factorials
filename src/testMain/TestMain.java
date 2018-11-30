package testMain;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestMain {

	@Test
	public void TestNotAFactorial() {
		int testNumber = 66;
		assertEquals("NONE", main.Main.findFactorial(testNumber));
	}

	@Test
	public void TestFactorial() {
		int testNumber = 120;
		assertEquals("120 = 5!", main.Main.findFactorial(testNumber));
	}

}
