import static org.junit.Assert.*;

import org.junit.Test;

public class ListIntersectionTestCases {

	@Test
	public void testSimpleReturnArray() {
		int [] array1 = {1,4,6};
		int [] array2 = {2,4,8};
		int [] result = {4,-1,-1};
		int [] expected = ListIntersection.listIntersection(array1,array2);
		for(int i=0;i<result.length;i++){
			System.out.println(expected[i]);
		}
 		assertArrayEquals(ListIntersection.listIntersection(array1,array2),result);
	}
	
	@Test
	public void noIntersection(){
		int [] array1 = {1,5,6};
		int [] array2 = {2,4,8};
		int [] result = {-1,-1,-1};
		assertArrayEquals(ListIntersection.listIntersection(array1,array2),result);
	}
	
	@Test
	public void nullArrayParameters(){
		int [] array1 = null;
		int [] array2 = null;
		int [] result = {};
		assertArrayEquals(ListIntersection.listIntersection(array1,array2),result);
	}
	
	@Test
	public void diiferentSizesArray(){
		int [] array1 = {1,5,6};
		int [] array2 = {1,2};
		int [] result = {};
		assertArrayEquals(ListIntersection.listIntersection(array1,array2),result);
	}
}
