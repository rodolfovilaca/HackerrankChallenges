import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixTests {

	@Test
	public void testMatrixDot() {
		double[] a = { 1, 2 };
		double[] b = { 2, 3 };
		assertEquals(Matrix.dot(a, b), 8, 0);
	}

	@Test
	public void testMatrixMult() {
		double[][] a = { { 4.00, 3.00 }, { 2.00, 1.00 } };
		double[][] b = { { -0.500, 1.500 }, { 1.000, -2.0000 } };
		double[][] c = {{1,0},{0,1}};
		assertArrayEquals(Matrix.mult(a, b), c);
	}

	//TODO
	@Test
	public void testTrasnpose() {
		fail("Not yet implemented");
	}

	@Test
	public void testMatrixVectorMult() {
		fail("Not yet implemented");
	}

	@Test
	public void testVectorMatrixMult() {
		fail("Not yet implemented");
	}

}
