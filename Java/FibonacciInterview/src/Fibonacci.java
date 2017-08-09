
public class Fibonacci {
	public static int valueOfNth(int n){
		int first = 0;
		int second = 1;
		int third = 0;
		if(n <= 0){
			return 0;
		}
		for(int i = 0;i<n-1;i++){
			third = first + second;
			first = second;
			second = third;
		}
		return second;
	}
}
