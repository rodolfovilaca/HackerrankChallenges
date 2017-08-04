// arrays of same size
// numbers with repetitions doesnt count
public class ListIntersection {
	public static int[] listIntersection(int[] arr1, int[] arr2){// [1,4,6], [2,4,8]
		if(arr1 == null || arr2 == null || arr1.length != arr2.length){
			int[] returnNull = {};
			return returnNull;
		}
		int [] result = new int[arr1.length];
		for(int i=0; i<result.length;i++){
			result[i] = -1;
		}
		int resultPointer = 0;
		for(int i=0; i<arr1.length;i++){//4
			for(int j=0; j<arr2.length;j++){//4
				if(arr1[i] == arr2[j]){
					boolean add = true;
					for(int k=0;k<result.length;k++){//result [-1,-1,1]
						if(arr1[i] == result[k]){// result [4,4,4]
							add = false;
						}
					}
					if(add){
						result[resultPointer] = arr1[i];
						resultPointer++;
					}
				}
			}
		}
		return result;
	}
}