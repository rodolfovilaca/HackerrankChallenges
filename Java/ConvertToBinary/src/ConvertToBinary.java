
public class ConvertToBinary {

	public static void main(String[] args) {
		convert(10);

	}
	public static String convert(int value){
		String binaryString = "";
		String binaryResultString = "";
		while(value > 0){
			binaryString += value%2;
			value = value/2;
		}
		for (int i =  binaryString.length()-1;i >=0;i--){
			binaryResultString += binaryString.charAt(i);
		}
		System.out.println(binaryResultString);
		return binaryResultString;
	}
}
