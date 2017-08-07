import static org.junit.Assert.*;

import org.junit.Test;

public class GroupsProblemTests {

	@Test
	public void twoFieldsTest() {
		boolean[][] farm = {{true,false,false},{true,true,false},{true,false,true}};
		assertEquals(GroupProblems.numberOfFields(farm),2);
	}
	@Test
	public void threeFieldsTest() {
		boolean[][] farm = {{true,false,true},{false,true,true},{true,false,true},{true,true,false}};
		assertEquals(GroupProblems.numberOfFields(farm),3);
	}
	@Test
	public void vectorMatrixTest() {
		boolean[][] farm = {{true,false,false}};
		assertEquals(GroupProblems.numberOfFields(farm),1);
	}
	@Test
	public void columnVectorTest() {
		boolean[][] farm = {{true},{true},{false}};
		assertEquals(GroupProblems.numberOfFields(farm),1);
	}
}
