import static org.junit.Assert.*;

import org.junit.Test;

public class StartOzTestCases {

	@Test
	public void ozTests() {
		assertEquals(StartOz.startOz("ozymandias"),"oz");
		assertEquals(StartOz.startOz("bzoo"),"z");
		assertEquals(StartOz.startOz("oxx"),"o");
		assertEquals(StartOz.startOz("oz"),"oz");
		assertEquals(StartOz.startOz("ounce"),"o");
		assertEquals(StartOz.startOz("o"),"o");
		assertEquals(StartOz.startOz("abc"),"");
		assertEquals(StartOz.startOz(""),"");
		assertEquals(StartOz.startOz("zoo"),"");
		assertEquals(StartOz.startOz("aztec"),"z");
		assertEquals(StartOz.startOz("zzzz"),"z");
		assertEquals(StartOz.startOz("oznic"),"oz");
	}

}
