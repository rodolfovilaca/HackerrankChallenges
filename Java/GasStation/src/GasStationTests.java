import static org.junit.Assert.*;

import org.junit.Test;

public class GasStationTests {

	@Test
	public void normalPosition() {
		int[] gas = {1,2,3,4,5};
		int[] cost = {1,3,2,4,5};
		assertEquals(GasStation.calculate(gas, cost),2);
	}
	
	@Test
	public void isNotPossible() {
		int[] gas = {1,2,3,4,5};
		int[] cost = {2,3,2,4,5};
		assertEquals(GasStation.calculate(gas, cost),-1);
	}
	
	@Test
	public void anotherWorks() {
		int[] gas = {1,4,3,4,5};
		int[] cost = {1,3,2,4,5};
		assertEquals(GasStation.calculate(gas, cost),0);
	}

}
