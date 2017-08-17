import static org.junit.Assert.*;

import org.junit.Test;

public class MakeBricksTestCases {

	@Test
	public void simpleTests() {
		assertEquals(MakeBricks.makeBricks(3, 1, 8),true);
		assertEquals(MakeBricks.makeBricks(3, 1, 9),false);
		assertEquals(MakeBricks.makeBricks(3, 2, 10),true);
		assertEquals(MakeBricks.makeBricks(3, 2, 8),true);
	}
	
	@Test
	public void higherNumberTest() {
		assertEquals(MakeBricks.makeBricks(43, 1, 46),true);
		assertEquals(MakeBricks.makeBricks(1000000, 1000, 1000100),true);
		assertEquals(MakeBricks.makeBricks(2, 1000000, 100003),false);
	}
	
	@Test
	public void onlySmallTests() {
		assertEquals(MakeBricks.makeBricks(6, 0, 11),false);
		assertEquals(MakeBricks.makeBricks(20, 0, 19),true);
		assertEquals(MakeBricks.makeBricks(20, 0, 21),false);
	}
	
	@Test
	public void onlyBigTests() {
		assertEquals(MakeBricks.makeBricks(0, 2, 11),false);
		assertEquals(MakeBricks.makeBricks(0, 2, 9),false);
		assertEquals(MakeBricks.makeBricks(0, 2, 10),true);
		assertEquals(MakeBricks.makeBricks(0, 3, 10),true);
	}


}
