package testng.sample;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class SimpleLongRunningUnitTest {

	private int number = 16;

	@Test
	public void givenNumber_whenEven_thenTrue() {
		assertEquals(number % 4 == 0, true);
	}

}
