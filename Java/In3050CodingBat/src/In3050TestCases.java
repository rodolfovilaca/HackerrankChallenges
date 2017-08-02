import static org.junit.Assert.*;

import org.junit.Test;

public class In3050TestCases {

	@Test
	public void test() {
		assertEquals(In3050.in3050(30,31),true);
		assertEquals(In3050.in3050(30,41),false);
		assertEquals(In3050.in3050(40,50),true);
		assertEquals(In3050.in3050(40,51),false);
		assertEquals(In3050.in3050(39,50),false);
		assertEquals(In3050.in3050(50,39),false);
		assertEquals(In3050.in3050(40,39),true);
		assertEquals(In3050.in3050(49,48),true);
		assertEquals(In3050.in3050(50,40),true);
		assertEquals(In3050.in3050(50,51),false);
	}

}
