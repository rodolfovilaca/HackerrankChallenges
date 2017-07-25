import org.junit.Test;

public class TestCases {

	@Test
	public void test() {
		assert(Main.between(1) == false);
		assert(Main.between(0) == false);
		assert(Main.between(0.5) == true);
		assert(Main.between(0.99) == true);
		assert(Main.between(0.01) == true);
		assert(Main.between(0.00) == false);
		assert(Main.between(-0.1) == false);
	}
}
