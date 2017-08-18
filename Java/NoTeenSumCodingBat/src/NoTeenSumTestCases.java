import static org.junit.Assert.*;

import org.junit.Test;

public class NoTeenSumTestCases {

	@Test
	public void notInRange() {
		assertEquals(NoTeenSum.noTeenSum(1, 2, 3),6);
		assertEquals(NoTeenSum.noTeenSum(3, 5, 7),15);
	}
	
	@Test
	public void validTeens() {
		assertEquals(NoTeenSum.noTeenSum(2, 1, 15),18);
		assertEquals(NoTeenSum.noTeenSum(2, 1, 16),19);
	}
	
	@Test
	public void invalidTeens() {
		assertEquals(NoTeenSum.noTeenSum(17, 1, 2),3);
		assertEquals(NoTeenSum.noTeenSum(5, 17, 18),5);
		assertEquals(NoTeenSum.noTeenSum(17, 19, 18),0);
	}
}
