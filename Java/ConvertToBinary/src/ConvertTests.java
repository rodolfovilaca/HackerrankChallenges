import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConvertTests {

	@Test
	public void test() {
		assertEquals(ConvertToBinary.convert(10),"1010");
		assertEquals(ConvertToBinary.convert(233),"11101001");
	}
}
