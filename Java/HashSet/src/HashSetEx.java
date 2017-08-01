import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx {
	
	public static HashSet<String> makeHashSet(int t,String [] pairLeft, String[] pairRigth){
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < t; i++) {
			set.add(pairLeft[i] + " " + pairRigth[i]);
			System.out.println(set.size());
		}
		return set;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];

		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}
		makeHashSet(t,pair_left,pair_right);
		s.close();
		
	}
}
