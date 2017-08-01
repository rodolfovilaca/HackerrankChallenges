import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	public static int rank(int key, int[] a) {
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid])
				hi = mid - 1;
			else if (key > a[mid])
				lo = mid + 1;
			else
				return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(br);
		int n = scan.nextInt();
		int[] whitelist = new int[n];
		int i = 0;
		while(scan.hasNextInt()){
			whitelist[i] = scan.nextInt();
			i++;
		}
		
		Arrays.sort(whitelist);
//		while (!StdIn.isEmpty()) { // Read key, print if not in whitelist.
//			int key = StdIn.readInt();
//			if (rank(key, whitelist) < 0)
//				StdOut.println(key);
//		}
		scan.close();
	}
}
