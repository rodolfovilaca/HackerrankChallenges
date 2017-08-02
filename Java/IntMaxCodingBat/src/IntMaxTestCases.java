import static org.junit.Assert.*;

import org.junit.Test;

public class IntMaxTestCases {

	@Test
	public void intMaxTests() {
		assertEquals(IntMax.intMax(1,2,3),3);
		assertEquals(IntMax.intMax(1,3,2),3);
		assertEquals(IntMax.intMax(3,2,1),3);
		assertEquals(IntMax.intMax(9,3,3),9);
		assertEquals(IntMax.intMax(3,9,3),9);
		assertEquals(IntMax.intMax(3,3,9),9);
		assertEquals(IntMax.intMax(8,2,3),8);
		assertEquals(IntMax.intMax(-3,-2,-1),-1);
		assertEquals(IntMax.intMax(6,2,5),6);
		assertEquals(IntMax.intMax(-1,0,-9),0);
	}

}
