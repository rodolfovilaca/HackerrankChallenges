public class Printer {
	public <T> void printArray(T[] array) {
		for (T obj : array) {
			System.out.println(obj);
		}
	}

	public static void main(String args[]) {
		Printer myPrinter = new Printer();
		Integer[] intArray = { 1, 2, 3 };
		String[] stringArray = { "Hello", "World" };
		myPrinter.printArray(intArray);
		myPrinter.printArray(stringArray);
	}
}
