
public class GasStation {
	public static int calculate(int[] gas, int[] cost) {
		int sumGas = 0;
		int sumCosts = 0;
		int position = 0;
		int remainingGas = 0;
		for (int i = 0; i < gas.length; i++) {
			sumGas += gas[i];
			sumCosts += cost[i];
			remainingGas = sumGas - sumCosts;
			if(remainingGas<0){
				position = i+1;
				remainingGas = 1;
			}
		}
		if(sumGas>=sumCosts){
			return position;
		}else return -1;
	}
}
