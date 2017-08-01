import static org.junit.Assert.*;

import org.junit.Test;

public class DateTests {

	@Test
	public void testNewDates() {
		Date twoofmarch = new Date("03/02/2017");
		assertEquals(twoofmarch.getDay(),2,0);
		assertEquals(twoofmarch.getMonth(),3,0);
		assertEquals(twoofmarch.getYear(),2017,0);
	}

}
