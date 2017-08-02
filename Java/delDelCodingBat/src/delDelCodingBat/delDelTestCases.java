package delDelCodingBat;

import static org.junit.Assert.*;

import org.junit.Test;

public class delDelTestCases {

	@Test
	public void delTests() {
		assertEquals(delDel.del("adelbc"),"abc");
		assertEquals(delDel.del("adelHello"),"aHello");
		assertEquals(delDel.del("adedbc"),"adedbc");
		assertEquals(delDel.del("abcdel"),"abcdel");
		assertEquals(delDel.del("add"),"add");
		assertEquals(delDel.del("ad"),"ad");
		assertEquals(delDel.del("a"),"a");
		assertEquals(delDel.del(""),"");
		assertEquals(delDel.del("del"),"del");
		assertEquals(delDel.del("adel"),"a");
		assertEquals(delDel.del("aadelbb"),"aadelbb");
	}
}
