import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixTests {

	@Test
	public void testMatrixDot() {
		double[] a = { 1, 2 };
		double[] b = { 2, 3 };
		assertEquals(Matrix.dot(a, b), 8, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMatrixMult() {
		double[][] a = { { 4.00, 3.00 }, { 2.00, 1.00 } };
		double[][] b = { { -0.500, 1.500 }, { 1.000, -2.0000 } };
		double[][] c = {{1,0},{0,1}};
		double[][] aError = {{4,3,1},{3,3,1}};//2x3
		double[][] bError = {{1,4},{3,5}};//2x2
		double[][] aDifSize = {{4.5,-1.5,0.0},{1.5,-6.5,3.5},{-1.5,-2.5,-1}}; // 3x3
		double[][] bDifSize = {{2.5,-1},{0,-1},{1,4}}; //3x2
		double[][] cDifSize = {{11.25,-3},{7.25,19},{-4.75,0}}; //3x2
		
		assertArrayEquals(Matrix.mult(a, b), c);
		assertArrayEquals(Matrix.mult(aError, bError),c);
		assertArrayEquals(Matrix.mult(aDifSize, bDifSize), cDifSize);
	}

	//TODO
	@Test
	public void testTrasnpose() {
		double[][] a = { {-1, 3.00,4 }, { 2.00, -5.00,0 },{1,4,2} };
		double[][] c = { {-1, 2.00,1 }, { 3.00, -5.00,4 },{4,0,2} };
		double[][] aDif = {{1,2},{1,-1},{4,-2}};// 3x2
		double[][] cDif = { {1,1,4 }, { 2.00, -1.00,-2 },};// 2x3
		
		assertArrayEquals(Matrix.transpose(a), c);
		assertArrayEquals(Matrix.transpose(aDif), cDif);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMatrixVectorMult() {
		double [][] matrix = {{2, -1,3}, {1,0,-2 },{3,4,1}};
		double [] vector = {2,-1,1};
		double [] result = {8,0,3};
		double [][] errorMatrix = {{2,3},{3,1},{1,-1}};//3x2
		double [] errorVector = {1,2};//1X2
		
		assertArrayEquals(Matrix.mult(errorMatrix,errorVector),result,0);
		assertArrayEquals(Matrix.mult(matrix,vector), result,0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testVectorMatrixMult() {
		double [][] matrix = {{2, -1,3}, {1,0,-2 },{3,4,1}};
		double [] vector = {2,-1,1};
		double [] result = {8,0,3};
		double [][] errorMatrix = {{2,3},{3,1},{1,-1}};//3x2
		double [] errorVector = {1,2};//1x2
		
		assertArrayEquals(Matrix.mult(vector,matrix), result,0);
		assertArrayEquals(Matrix.mult(errorVector,errorMatrix),result,0);
	}

}
