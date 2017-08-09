import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTests {

	@Test
	public void valueSeven() {
		assertEquals(Fibonacci.valueOfNth(7),13);
	}
	
	@Test
	public void valueOne() {
		assertEquals(Fibonacci.valueOfNth(1),1);
	}
	
	@Test
	public void valueThree() {
		assertEquals(Fibonacci.valueOfNth(3),2);
	}
	
	@Test
	public void valueZero() {
		assertEquals(Fibonacci.valueOfNth(0),0);
	}
	
	@Test
	public void valueNegativeN() {
		assertEquals(Fibonacci.valueOfNth(-1),0);
	}

}
