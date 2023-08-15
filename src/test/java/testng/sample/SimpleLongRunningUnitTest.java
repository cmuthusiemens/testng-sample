package testng.sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleLongRunningUnitTest {

	private int number = 10;

	@Test
	public void givenNumber_whenEven_thenTrue() {
		Assert.assertEquals(number % 2 == 0, true);
	}

}
