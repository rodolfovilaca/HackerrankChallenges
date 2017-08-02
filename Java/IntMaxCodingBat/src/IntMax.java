///Given three int values, a b c, return the largest.
public class IntMax {
	public static int intMax(int a, int b, int c) {
		  if(b>a){
		    a = b;
		  }
		  if(c>a){
		    a = c;
		  }
		  return a;
		}
}
