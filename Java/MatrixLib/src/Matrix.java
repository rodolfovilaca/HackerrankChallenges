
public class Matrix {

	public static double dot(double[] x, double[] y) {
		double result = 0;
		for (int i = 0; i < x.length; i++) {
			result += x[i] * y[i];
		}
		return result;
	}

	public static double[][] mult(double[][] a, double[][] b) {
		int aRows = a.length;
		int aColumns = a[0].length;
		int bRows = b.length;
		int bColumns = b[0].length;
		double[][] result = new double[aRows][aColumns];
		for (int i = 0; i < aRows; i++) { // aRow
			for (int j = 0; j < bColumns; j++) { // bColumn
				for (int k = 0; k < aColumns; k++) { // aColumn
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return result;
	}

	//TODO REST OF Exercises
	public static double[][] transpose(double[][] a) {
		double[][] result = new double[a.length][a.length];
		return result;
	}

	public static double[] mult(double[][] a, double[] x) {
		double[] result = new double[a.length];
		return result;
	}

	public static double[] mult(double[] y, double[][] a) {
		double[] result = new double[a.length];
		return result;
	}

}
