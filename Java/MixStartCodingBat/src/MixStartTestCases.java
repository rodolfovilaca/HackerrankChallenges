import static org.junit.Assert.*;

import org.junit.Test;

public class MixStartTestCases {

	@Test
	public void mixTests() {
		assertEquals(MixStart.mixStart("mix snacks"),true);
		assertEquals(MixStart.mixStart("pix snacks"),true);
		assertEquals(MixStart.mixStart("piz snacks"),false);
		assertEquals(MixStart.mixStart("nix"),true);
		assertEquals(MixStart.mixStart("ni"),false);
		assertEquals(MixStart.mixStart("n"),false);
		assertEquals(MixStart.mixStart(""),false);
	}

}
