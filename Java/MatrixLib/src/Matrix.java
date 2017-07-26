
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
		if(aColumns != bRows){
			throw new IllegalArgumentException("This multiplication is not defined: 'a' Colums must be equal 'b' Rows");
		}
		double[][] result = new double[aRows][bColumns];
		for (int i = 0; i < aRows; i++) {
			for (int j = 0; j < bColumns; j++) {
				for (int k = 0; k < aColumns; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return result;
	}
	
	public static double[][] transpose(double[][] a) {
		int aRows = a.length;
		int aColumns = a[0].length;
		double[][] result = new double[aColumns][aRows];
		for(int i=0; i<aRows;i++){
			for(int j=0; j<aColumns;j++){
				result[j][i] = a[i][j];
			}
		}
		return result;
	}
	
	public static double[] mult(double[][] a, double[] x) {
		int matrixRows = a.length;
		int matrixColumns = a[0].length;
		int vectorColumns = x.length;
		if(vectorColumns != matrixRows){
			throw new IllegalArgumentException("This multiplication is not defined: Matrix Rows must be equal to Vector Columns");
		}
		double[] result = new double[matrixRows];
		for(int i=0; i< matrixRows;i++){
			for(int j = 0;j<matrixColumns;j++){
				result[i] += a[i][j]*x[j];
			}
		}
		return result;
	}

	public static double[] mult(double[] y, double[][] a) {
		int matrixRows = a.length;
		int matrixColumns = a[0].length;
		int vectorColumns = y.length;
		if(vectorColumns != matrixRows){
			throw new IllegalArgumentException("This multiplication is not defined: Matrix Rows must be equal to Vector Columns");
		}
		double[] result = new double[matrixRows];
		for(int i=0; i< matrixRows;i++){
			for(int j = 0;j<matrixColumns;j++){
				result[i] += a[i][j]*y[j];
			}
		}
		return result;
	}

}
