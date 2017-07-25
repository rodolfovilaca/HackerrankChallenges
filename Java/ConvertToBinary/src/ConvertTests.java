import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ConvertTests {

	@Test
	public void test() {
		assertEquals(ConvertToBinary.convert(10),"1010");
		assertEquals(ConvertToBinary.convert(233),"11101001");
	}
}
