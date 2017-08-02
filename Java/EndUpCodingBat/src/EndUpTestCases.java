import static org.junit.Assert.*;

import org.junit.Test;

public class EndUpTestCases {

	@Test
	public void endUpTestCases() {
		assertEquals(EndUp.endUp("Hello"),"HeLLO");
		assertEquals(EndUp.endUp("hi there"),"hi thERE");
		assertEquals(EndUp.endUp("hi"),"HI");
		assertEquals(EndUp.endUp("woo hoo"),"woo HOO");
		assertEquals(EndUp.endUp("xyz12"),"xyZ12");
		assertEquals(EndUp.endUp("x"),"X");
		assertEquals(EndUp.endUp(""),"");
	}
}
