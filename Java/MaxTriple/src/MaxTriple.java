//Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. 
//The array length will be a least 1.
public class MaxTriple {
	public static int maxTriple(int[] nums){
		int max = 0;
		  for(int i=0;i<nums.length;i+=(nums.length/2)){
		    if(nums[i]>max){
		      max = nums[i];
		    }
		  }
		  return max;
	}
}
